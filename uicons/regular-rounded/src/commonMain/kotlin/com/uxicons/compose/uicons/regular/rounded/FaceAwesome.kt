package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAwesome: ImageVector? = null

val Icons.Rr.FaceAwesome: ImageVector
    get() = _FaceAwesome ?: UXIcon(name = "FaceAwesome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.65f)
                curveToRelative(-0.15f, 0.09f, -0.31f, 0.15f, -0.5f, 0.15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.15f, 0.04f, -0.28f, 0.09f, -0.41f)
                curveToRelative(-0.35f, 0.16f, -0.59f, 0.5f, -0.59f, 0.91f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.65f)
                curveToRelative(-0.15f, 0.09f, -0.31f, 0.15f, -0.5f, 0.15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.15f, 0.04f, -0.28f, 0.09f, -0.41f)
                curveToRelative(-0.35f, 0.16f, -0.59f, 0.5f, -0.59f, 0.91f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
            }
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
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.08f, 13.32f)
                lineTo(5.92f, 13.32f)
                curveToRelative(-0.59f, 0f, -1.05f, 0.56f, -0.88f, 1.13f)
                curveToRelative(0.88f, 3.02f, 3.66f, 5.22f, 6.97f, 5.22f)
                reflectiveCurveToRelative(6.08f, -2.21f, 6.97f, -5.22f)
                curveToRelative(0.17f, -0.57f, -0.29f, -1.13f, -0.88f, -1.13f)
                close()
                moveTo(12f, 17.86f)
                reflectiveCurveToRelative(-0.02f, 0f, -0.04f, 0f)
                curveToRelative(0.49f, -1.57f, 1.94f, -2.72f, 3.67f, -2.72f)
                curveToRelative(0.38f, 0f, 0.73f, 0.01f, 1.04f, 0.05f)
                curveToRelative(-0.95f, 1.6f, -2.68f, 2.67f, -4.67f, 2.67f)
                close()
            }
        }.also { _FaceAwesome = it}
