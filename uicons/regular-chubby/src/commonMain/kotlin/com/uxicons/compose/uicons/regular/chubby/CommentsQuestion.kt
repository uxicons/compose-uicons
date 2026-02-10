package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentsQuestion: ImageVector? = null

val Icons.Rc.CommentsQuestion: ImageVector
    get() = _CommentsQuestion ?: UXIcon(name = "CommentsQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.43f, 8.84f)
                curveToRelative(-0.34f, -0.44f, -0.97f, -0.52f, -1.4f, -0.18f)
                curveToRelative(-0.44f, 0.34f, -0.52f, 0.97f, -0.18f, 1.4f)
                curveToRelative(0.78f, 1.0f, 1.16f, 2.5f, 1.16f, 4.58f)
                curveToRelative(0f, 1.88f, -0.23f, 3.79f, -0.67f, 5.68f)
                curveToRelative(-1.86f, 0.43f, -3.85f, 0.67f, -5.68f, 0.67f)
                curveToRelative(-2.14f, 0f, -3.59f, -0.36f, -4.57f, -1.14f)
                curveToRelative(-0.43f, -0.34f, -1.06f, -0.27f, -1.4f, 0.16f)
                curveToRelative(-0.34f, 0.43f, -0.27f, 1.06f, 0.16f, 1.41f)
                curveToRelative(1.35f, 1.07f, 3.2f, 1.57f, 5.81f, 1.57f)
                curveToRelative(2.8f, 0f, 5.22f, -0.48f, 6.76f, -0.88f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.58f, -2.24f, 0.88f, -4.52f, 0.88f, -6.76f)
                curveToRelative(0f, -2.54f, -0.52f, -4.44f, -1.57f, -5.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.7f, 9.35f)
                curveToRelative(0f, -7.49f, -4.76f, -8.35f, -8.35f, -8.35f)
                reflectiveCurveToRelative(-8.35f, 0.87f, -8.35f, 8.35f)
                curveToRelative(0f, 2.24f, 0.29f, 4.52f, 0.88f, 6.76f)
                curveToRelative(0.09f, 0.35f, 0.36f, 0.62f, 0.72f, 0.72f)
                curveToRelative(1.54f, 0.4f, 3.96f, 0.88f, 6.76f, 0.88f)
                curveToRelative(3.58f, 0f, 8.35f, -0.87f, 8.35f, -8.35f)
                close()
                moveTo(3f, 9.35f)
                curveToRelative(0f, -5.29f, 2.43f, -6.35f, 6.35f, -6.35f)
                reflectiveCurveToRelative(6.35f, 1.06f, 6.35f, 6.35f)
                reflectiveCurveToRelative(-2.43f, 6.35f, -6.35f, 6.35f)
                curveToRelative(-1.82f, 0f, -3.82f, -0.24f, -5.68f, -0.67f)
                curveToRelative(-0.45f, -1.89f, -0.67f, -3.8f, -0.67f, -5.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.35f, 8.86f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.45f, -0.99f, 1f)
                verticalLineToRelative(0.66f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.48f, 0f, 0.87f, -0.33f, 0.97f, -0.78f)
                curveToRelative(1.34f, -0.33f, 2.11f, -1.38f, 2.14f, -3.01f)
                curveToRelative(-0.03f, -1.93f, -1.19f, -3.08f, -3.12f, -3.09f)
                curveToRelative(-1.91f, 0.01f, -3.07f, 1.17f, -3.1f, 3.09f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.01f, 0.98f, 1.02f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.54f, 0f, 0.99f, -0.44f, 1f, -0.98f)
                curveToRelative(0.02f, -0.85f, 0.29f, -1.12f, 1.1f, -1.13f)
                curveToRelative(0.81f, 0.01f, 1.1f, 0.3f, 1.12f, 1.09f)
                curveToRelative(-0.02f, 0.86f, -0.28f, 1.12f, -1.12f, 1.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.35f, 13.28f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
        }.also { _CommentsQuestion = it}
