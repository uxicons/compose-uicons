package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentMedical: ImageVector? = null

val Icons.Sr.CommentMedical: ImageVector
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
                moveTo(16f, 13f)
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
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _CommentMedical = it}
