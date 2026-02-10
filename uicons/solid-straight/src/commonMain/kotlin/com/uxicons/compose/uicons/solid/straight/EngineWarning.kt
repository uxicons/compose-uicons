package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Ss.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                curveToRelative(0.38f, 10.59f, 15.63f, 10.59f, 16f, 0f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
                moveTo(13f, 17f)
                lineTo(11f, 17f)
                lineTo(11f, 15f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21.26f, 19.64f)
                lineTo(19.71f, 18.36f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.73f)
                lineToRelative(1.54f, -1.27f)
                arcTo(12.07f, 12.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.26f, 19.64f)
                close()
                moveTo(2.74f, 19.64f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -15.27f)
                lineTo(4.29f, 5.64f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.73f)
                close()
            }
        }.also { _EngineWarning = it}
