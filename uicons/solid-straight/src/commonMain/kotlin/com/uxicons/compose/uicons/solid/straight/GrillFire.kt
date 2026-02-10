package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrillFire: ImageVector? = null

val Icons.Ss.GrillFire: ImageVector
    get() = _GrillFire ?: UXIcon(name = "GrillFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                close()
                moveTo(19.41f, 18.59f)
                lineTo(18.0f, 17.17f)
                lineTo(16.58f, 18.59f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                reflectiveCurveToRelative(2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                close()
                moveTo(0f, 6f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 6.0f, 4.13f, 9.15f, 6.17f, 10.35f)
                lineToRelative(-0.83f, 1.67f)
                curveToRelative(-1.3f, 0.09f, -2.33f, 1.16f, -2.33f, 2.48f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.71f, -0.3f, -1.34f, -0.77f, -1.8f)
                lineToRelative(0.85f, -1.7f)
                horizontalLineToRelative(1.93f)
                curveToRelative(-0.04f, -2.54f, 1.45f, -4.41f, 2.56f, -5.54f)
                lineToRelative(5.34f, -5.46f)
                curveToRelative(1.55f, 1.67f, 3.38f, 3.09f, 5.07f, 4.76f)
                curveToRelative(0.64f, -1.35f, 1.03f, -2.88f, 1.04f, -4.76f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _GrillFire = it}
