package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Tr.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                lineTo(2f, 20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(21f, 4.5f)
                verticalLineToRelative(12.5f)
                lineTo(7f, 17f)
                lineTo(7f, 1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3f, 4.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.22f, 3f, -3.46f)
                verticalLineToRelative(15.96f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.4f, -2.5f, 1.05f)
                lineTo(3f, 4.5f)
                close()
                moveTo(17.5f, 23f)
                lineTo(5.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(9.92f, 13.97f)
                curveToRelative(0.26f, 0.09f, 0.55f, -0.04f, 0.64f, -0.3f)
                lineToRelative(0.97f, -2.67f)
                horizontalLineToRelative(4.81f)
                lineToRelative(0.97f, 2.67f)
                curveToRelative(0.07f, 0.2f, 0.27f, 0.33f, 0.47f, 0.33f)
                curveToRelative(0.06f, 0f, 0.11f, 0f, 0.17f, -0.03f)
                curveToRelative(0.26f, -0.09f, 0.39f, -0.38f, 0.3f, -0.64f)
                lineToRelative(-3.07f, -8.46f)
                curveToRelative(-0.19f, -0.53f, -0.68f, -0.87f, -1.25f, -0.87f)
                reflectiveCurveToRelative(-1.05f, 0.34f, -1.24f, 0.87f)
                lineToRelative(-3.07f, 8.46f)
                curveToRelative(-0.09f, 0.26f, 0.04f, 0.55f, 0.3f, 0.64f)
                close()
                moveTo(13.63f, 5.21f)
                curveToRelative(0.07f, -0.19f, 0.24f, -0.21f, 0.3f, -0.21f)
                reflectiveCurveToRelative(0.24f, 0.02f, 0.31f, 0.21f)
                lineToRelative(1.74f, 4.79f)
                horizontalLineToRelative(-4.08f)
                lineToRelative(1.74f, -4.79f)
                close()
            }
        }.also { _BookFont = it}
