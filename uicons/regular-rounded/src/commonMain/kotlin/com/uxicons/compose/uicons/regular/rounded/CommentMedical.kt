package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentMedical: ImageVector? = null

val Icons.Rr.CommentMedical: ImageVector
    get() = _CommentMedical ?: UXIcon(name = "CommentMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.85f, 0.03f)
                curveToRelative(-3.48f, -0.24f, -6.88f, 1.03f, -9.34f, 3.48f)
                curveTo(1.06f, 5.97f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.07f, 11.15f, 13.08f, 11.15f)
                horizontalLineToRelative(5.89f)
                curveToRelative(2.94f, 0f, 5.0f, -2.4f, 5.0f, -5.85f)
                verticalLineToRelative(-5.82f)
                curveTo(24f, 5.87f, 19.1f, 0.46f, 12.85f, 0.03f)
                close()
                moveTo(22f, 18.15f)
                curveToRelative(0f, 2.3f, -1.21f, 3.85f, -3.0f, 3.85f)
                horizontalLineToRelative(-5.89f)
                curveToRelative(-6.05f, 0f, -10.71f, -3.9f, -11.09f, -9.29f)
                curveToRelative(-0.2f, -2.9f, 0.86f, -5.74f, 2.9f, -7.79f)
                curveToRelative(1.88f, -1.88f, 4.43f, -2.93f, 7.09f, -2.93f)
                curveToRelative(0.23f, 0f, 0.47f, 0.01f, 0.7f, 0.02f)
                curveToRelative(5.21f, 0.36f, 9.29f, 4.89f, 9.29f, 10.31f)
                verticalLineToRelative(5.82f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CommentMedical = it}
