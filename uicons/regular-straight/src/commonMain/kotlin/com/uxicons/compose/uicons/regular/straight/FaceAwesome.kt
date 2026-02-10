package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAwesome: ImageVector? = null

val Icons.Rs.FaceAwesome: ImageVector
    get() = _FaceAwesome ?: UXIcon(name = "FaceAwesome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.05f)
                curveToRelative(-0.08f, 0.02f, -0.16f, 0.05f, -0.25f, 0.05f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0f, -0.04f, 0.02f, -0.07f, 0.02f, -0.11f)
                curveToRelative(-0.31f, 0.17f, -0.52f, 0.49f, -0.52f, 0.86f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(19f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.05f)
                curveToRelative(-0.08f, 0.02f, -0.16f, 0.05f, -0.25f, 0.05f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0f, -0.04f, 0.02f, -0.07f, 0.02f, -0.11f)
                curveToRelative(-0.31f, 0.17f, -0.52f, 0.49f, -0.52f, 0.86f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(12f, 19.09f)
                curveToRelative(3.6f, 0f, 6.56f, -2.7f, 7f, -6.18f)
                lineTo(5f, 12.91f)
                curveToRelative(0.44f, 3.48f, 3.4f, 6.18f, 7f, 6.18f)
                close()
                moveTo(15.53f, 14.68f)
                curveToRelative(0.37f, 0f, 0.71f, 0f, 1.01f, 0.05f)
                curveToRelative(-0.92f, 1.55f, -2.61f, 2.6f, -4.54f, 2.6f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.04f, 0f)
                curveToRelative(0.47f, -1.53f, 1.88f, -2.65f, 3.57f, -2.65f)
                close()
            }
        }.also { _FaceAwesome = it}
