package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Script: ImageVector? = null

val Icons.Rs.Script: ImageVector
    get() = _Script ?: UXIcon(name = "Script") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                horizontalLineToRelative(4.24f)
                lineToRelative(6.88f, -6.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                reflectiveCurveToRelative(-3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-6.88f, 6.88f)
                verticalLineToRelative(4.24f)
                close()
                moveTo(14f, 8.59f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-6.29f, 6.29f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-1.41f)
                close()
                moveTo(20f, 17f)
                verticalLineToRelative(-5.93f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(3.93f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(7f, 3.5f)
                curveToRelative(0f, -0.54f, -0.13f, -1.04f, -0.35f, -1.5f)
                horizontalLineToRelative(8.28f)
                lineTo(16.89f, 0.04f)
                curveToRelative(-0.13f, -0.01f, -0.26f, -0.04f, -0.39f, -0.04f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(22f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-8.84f)
                curveToRelative(0.22f, -0.46f, 0.34f, -0.96f, 0.34f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Script = it}
