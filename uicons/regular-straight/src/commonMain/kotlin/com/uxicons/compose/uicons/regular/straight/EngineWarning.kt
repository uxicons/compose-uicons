package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Rs.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                curveTo(4.38f, 1.41f, 19.63f, 1.42f, 20f, 12f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-7.93f, 0.25f, -7.93f, 11.75f, 0f, 12f)
                curveTo(19.93f, 17.75f, 19.93f, 6.25f, 12f, 6f)
                close()
                moveTo(13f, 8f)
                lineTo(11f, 8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                lineTo(11f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 12f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.74f, -7.64f)
                lineTo(19.71f, 5.64f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.73f)
                lineToRelative(1.54f, 1.27f)
                arcTo(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(4.29f, 18.36f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.73f)
                lineTo(2.74f, 4.36f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.27f)
                close()
            }
        }.also { _EngineWarning = it}
