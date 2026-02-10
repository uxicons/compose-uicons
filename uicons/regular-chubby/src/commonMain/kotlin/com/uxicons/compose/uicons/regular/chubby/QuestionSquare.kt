package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Rc.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.81f, 2.86f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveToRelative(-8.95f, 1.14f, -9.12f, 1.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                close()
                moveTo(20.04f, 20.02f)
                curveToRelative(-1.24f, 0.3f, -4.46f, 0.97f, -8.04f, 0.97f)
                reflectiveCurveToRelative(-6.8f, -0.68f, -8.04f, -0.98f)
                curveToRelative(-0.3f, -1.19f, -0.96f, -4.23f, -0.96f, -8.02f)
                curveToRelative(0f, -3.75f, 0.67f, -6.83f, 0.96f, -8.03f)
                curveToRelative(1.24f, -0.3f, 4.46f, -0.97f, 8.04f, -0.97f)
                reflectiveCurveToRelative(6.8f, 0.68f, 8.04f, 0.98f)
                curveToRelative(0.3f, 1.19f, 0.96f, 4.23f, 0.96f, 8.02f)
                curveToRelative(0f, 3.75f, -0.67f, 6.83f, -0.96f, 8.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 5.5f)
                curveToRelative(-2.49f, 0.02f, -3.95f, 1.49f, -3.99f, 4.05f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.01f, 0.98f, 1.02f)
                curveToRelative(0.57f, 0.03f, 1.01f, -0.43f, 1.02f, -0.98f)
                curveToRelative(0.03f, -1.47f, 0.61f, -2.08f, 1.99f, -2.09f)
                curveToRelative(1.38f, 0.01f, 1.98f, 0.63f, 2.01f, 2.05f)
                curveToRelative(-0.03f, 1.51f, -0.57f, 2.08f, -2.01f, 2.09f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.45f, -0.99f, 1f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.95f)
                curveToRelative(1.9f, -0.35f, 2.96f, -1.73f, 3f, -4.0f)
                curveToRelative(-0.04f, -2.52f, -1.54f, -4.04f, -4.01f, -4.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _QuestionSquare = it}
