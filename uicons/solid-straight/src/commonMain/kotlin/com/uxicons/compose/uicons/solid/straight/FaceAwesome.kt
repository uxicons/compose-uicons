package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAwesome: ImageVector? = null

val Icons.Ss.FaceAwesome: ImageVector
    get() = _FaceAwesome ?: UXIcon(name = "FaceAwesome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.54f, 14.72f)
                curveToRelative(-0.31f, -0.04f, -0.64f, -0.05f, -1.01f, -0.05f)
                curveToRelative(-1.68f, 0f, -3.09f, 1.12f, -3.57f, 2.65f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.04f, 0f)
                curveToRelative(1.93f, 0f, 3.62f, -1.05f, 4.54f, -2.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(5f, 9.5f)
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
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12f, 19.09f)
                curveToRelative(-3.6f, 0f, -6.56f, -2.7f, -7f, -6.18f)
                horizontalLineToRelative(14f)
                curveToRelative(-0.44f, 3.48f, -3.4f, 6.18f, -7f, 6.18f)
                close()
                moveTo(19f, 11f)
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
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _FaceAwesome = it}
