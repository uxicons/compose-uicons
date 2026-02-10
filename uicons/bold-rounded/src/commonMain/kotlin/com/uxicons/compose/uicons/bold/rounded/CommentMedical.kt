package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentMedical: ImageVector? = null

val Icons.Br.CommentMedical: ImageVector
    get() = _CommentMedical ?: UXIcon(name = "CommentMedical") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.85f, 0.03f)
            curveToRelative(-3.48f, -0.24f, -6.88f, 1.03f, -9.34f, 3.48f)
            curveTo(1.06f, 5.97f, -0.21f, 9.38f, 0.03f, 12.85f)
            curveToRelative(0.44f, 6.35f, 6.04f, 11.15f, 13.03f, 11.15f)
            horizontalLineToRelative(5.62f)
            curveToRelative(3.08f, 0f, 5.32f, -2.58f, 5.32f, -6.13f)
            verticalLineToRelative(-5.55f)
            curveTo(24f, 5.86f, 19.1f, 0.46f, 12.85f, 0.03f)
            close()
            moveTo(21f, 17.87f)
            curveToRelative(0f, 1.9f, -0.91f, 3.13f, -2.32f, 3.13f)
            horizontalLineToRelative(-5.62f)
            curveToRelative(-5.48f, 0f, -9.71f, -3.51f, -10.04f, -8.35f)
            curveToRelative(-0.18f, -2.61f, 0.77f, -5.17f, 2.61f, -7.01f)
            curveToRelative(1.69f, -1.69f, 3.99f, -2.64f, 6.38f, -2.64f)
            curveToRelative(0.21f, 0f, 0.42f, 0.01f, 0.63f, 0.02f)
            curveToRelative(4.68f, 0.33f, 8.36f, 4.41f, 8.36f, 9.3f)
            verticalLineToRelative(5.55f)
            close()
            moveTo(17f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _CommentMedical = it }
