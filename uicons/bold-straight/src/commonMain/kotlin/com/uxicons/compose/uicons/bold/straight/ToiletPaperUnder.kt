package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperUnder: ImageVector? = null

val Icons.Bs.ToiletPaperUnder: ImageVector
    get() = _ToiletPaperUnder ?: UXIcon(name = "ToiletPaperUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -4.42f, -1.79f, -8f, -4f, -8f)
                lineTo(5.5f, 0f)
                curveTo(2.42f, 0f, 0f, 3.51f, 0f, 8f)
                curveToRelative(0f, 4.24f, 2.16f, 7.61f, 5f, 7.97f)
                verticalLineToRelative(3.53f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(19f, 8f)
                curveToRelative(0f, 1.93f, -0.45f, 3.5f, -1f, 3.5f)
                reflectiveCurveToRelative(-1f, -1.57f, -1f, -3.5f)
                reflectiveCurveToRelative(0.45f, -3.5f, 1f, -3.5f)
                reflectiveCurveToRelative(1f, 1.57f, 1f, 3.5f)
                close()
                moveTo(3.13f, 9.5f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(0.36f, -2.08f, 1.41f, -3.5f, 2.37f, -3.5f)
                horizontalLineToRelative(9.38f)
                curveToRelative(-0.4f, 1.0f, -0.68f, 2.19f, -0.81f, 3.5f)
                horizontalLineToRelative(-2.07f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.12f, 1.31f, 0.41f, 2.5f, 0.81f, 3.5f)
                lineTo(5.5f, 13f)
                curveToRelative(-0.96f, 0f, -2.02f, -1.42f, -2.37f, -3.5f)
                close()
                moveTo(9.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.34f, 0f, 0.68f, -0.09f, 1f, -0.25f)
                verticalLineToRelative(3.25f)
                curveToRelative(0f, 0.71f, 0.15f, 1.39f, 0.42f, 2f)
                horizontalLineToRelative(-9.92f)
                close()
                moveTo(10f, 9.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _ToiletPaperUnder = it}
