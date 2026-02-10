package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentMedical: ImageVector? = null

val Icons.Tr.CommentMedical: ImageVector
    get() = _CommentMedical ?: UXIcon(name = "CommentMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.18f, 3.32f)
                curveTo(17.85f, 1.07f, 14.81f, -0.11f, 11.62f, 0.01f)
                curveTo(5.3f, 0.23f, 0.09f, 5.55f, 0.0f, 11.87f)
                curveToRelative(-0.04f, 3.1f, 1.13f, 6.03f, 3.31f, 8.24f)
                curveToRelative(2.48f, 2.51f, 5.97f, 3.9f, 9.85f, 3.9f)
                horizontalLineToRelative(6.34f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -3.4f, -1.39f, -6.69f, -3.82f, -9.04f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.34f)
                curveToRelative(-3.6f, 0f, -6.85f, -1.28f, -9.14f, -3.6f)
                curveToRelative(-1.99f, -2.02f, -3.06f, -4.69f, -3.02f, -7.52f)
                curveTo(1.08f, 6.08f, 5.87f, 1.21f, 11.66f, 1.01f)
                curveToRelative(0.13f, -0.0f, 0.25f, -0.01f, 0.38f, -0.01f)
                curveToRelative(2.78f, 0f, 5.41f, 1.07f, 7.45f, 3.04f)
                curveToRelative(2.23f, 2.16f, 3.52f, 5.19f, 3.52f, 8.32f)
                verticalLineToRelative(7.14f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _CommentMedical = it}
