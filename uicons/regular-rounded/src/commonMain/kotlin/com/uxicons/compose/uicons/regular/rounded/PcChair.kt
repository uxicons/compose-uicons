package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PcChair: ImageVector? = null

val Icons.Rr.PcChair: ImageVector
    get() = _PcChair ?: UXIcon(name = "PcChair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 7f)
                verticalLineToRelative(6.32f)
                curveToRelative(-0.6f, 0.22f, -1.64f, 0.56f, -3f, 0.87f)
                verticalLineToRelative(-11.19f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11.19f)
                curveToRelative(-1.36f, -0.32f, -2.4f, -0.65f, -3f, -0.87f)
                verticalLineToRelative(-6.32f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.65f)
                curveToRelative(1.19f, 0.47f, 4.1f, 2.0f, 11f, 2.33f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.02f)
                curveToRelative(6.91f, -0.33f, 9.8f, -1.86f, 11f, -2.33f)
                verticalLineToRelative(-7.65f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8.75f)
                curveToRelative(-3.29f, -0.99f, -6.71f, -0.99f, -10f, 0f)
                verticalLineToRelative(-8.75f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(7f, 13.84f)
                curveToRelative(3.27f, -1.12f, 6.72f, -1.12f, 10f, 0f)
                verticalLineToRelative(0.75f)
                curveToRelative(-1.46f, 0.24f, -3.15f, 0.41f, -5f, 0.41f)
                reflectiveCurveToRelative(-3.54f, -0.17f, -5f, -0.41f)
                close()
            }
        }.also { _PcChair = it}
