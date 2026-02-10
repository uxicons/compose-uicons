package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Bs.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 7f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                close()
                moveTo(13.5f, 17f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 14f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13.5f, 12f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 7f)
                horizontalLineToRelative(3f)
                close()
                moveTo(5.64f, 18.36f)
                lineTo(3.52f, 20.48f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16.97f)
                lineTo(5.64f, 5.64f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.64f, 18.36f)
                close()
                moveTo(20.48f, 20.48f)
                lineTo(18.36f, 18.36f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.73f)
                lineToRelative(2.12f, -2.12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.48f, 20.48f)
                close()
            }
        }.also { _EngineWarning = it}
