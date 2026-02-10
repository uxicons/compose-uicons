package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentMedical: ImageVector? = null

val Icons.Tc.CommentMedical: ImageVector
    get() = _CommentMedical ?: UXIcon(name = "CommentMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 1f)
                curveToRelative(-6.95f, 0.04f, -10.85f, 3.95f, -10.97f, 11.01f)
                curveToRelative(0.13f, 7.25f, 3.82f, 10.95f, 10.98f, 10.99f)
                curveToRelative(3.06f, -0.02f, 9.62f, -0.64f, 9.9f, -0.67f)
                curveToRelative(0.24f, -0.02f, 0.43f, -0.21f, 0.45f, -0.45f)
                curveToRelative(0.01f, -0.06f, 0.55f, -6.11f, 0.62f, -9.87f)
                verticalLineToRelative(-0.02f)
                curveToRelative(-0.13f, -7.15f, -3.92f, -10.95f, -10.98f, -10.99f)
                close()
                moveTo(21.4f, 21.38f)
                curveToRelative(-1.52f, 0.14f, -6.82f, 0.61f, -9.39f, 0.62f)
                curveToRelative(-6.59f, -0.04f, -9.86f, -3.31f, -9.98f, -9.99f)
                curveToRelative(0.14f, -8.22f, 5.5f, -9.98f, 9.97f, -10.01f)
                curveToRelative(6.5f, 0.04f, 9.86f, 3.4f, 9.98f, 10f)
                curveToRelative(-0.06f, 3.16f, -0.46f, 7.95f, -0.58f, 9.38f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _CommentMedical = it}
