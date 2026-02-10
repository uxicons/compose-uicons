package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Tc.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.77f, 2.56f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.29f, -0.34f, -0.34f)
                curveToRelative(-0.18f, -0.05f, -4.41f, -1.23f, -9.43f, -1.23f)
                reflectiveCurveToRelative(-9.25f, 1.18f, -9.43f, 1.23f)
                curveToRelative(-0.16f, 0.05f, -0.29f, 0.17f, -0.34f, 0.34f)
                curveToRelative(-0.05f, 0.17f, -1.23f, 4.13f, -1.23f, 9.44f)
                curveToRelative(0f, 5.35f, 1.18f, 9.27f, 1.23f, 9.44f)
                curveToRelative(0.05f, 0.16f, 0.18f, 0.29f, 0.34f, 0.34f)
                curveToRelative(0.18f, 0.05f, 4.41f, 1.23f, 9.43f, 1.23f)
                reflectiveCurveToRelative(9.25f, -1.18f, 9.43f, -1.23f)
                curveToRelative(0.16f, -0.05f, 0.29f, -0.17f, 0.34f, -0.34f)
                curveToRelative(0.05f, -0.17f, 1.23f, -4.13f, 1.23f, -9.44f)
                curveToRelative(0f, -5.35f, -1.18f, -9.27f, -1.23f, -9.44f)
                close()
                moveTo(20.89f, 20.88f)
                curveToRelative(-1.01f, 0.26f, -4.73f, 1.12f, -8.89f, 1.12f)
                reflectiveCurveToRelative(-7.88f, -0.86f, -8.89f, -1.12f)
                curveToRelative(-0.26f, -0.96f, -1.11f, -4.46f, -1.11f, -8.88f)
                curveToRelative(0f, -4.39f, 0.85f, -7.91f, 1.11f, -8.88f)
                curveToRelative(1.01f, -0.26f, 4.73f, -1.12f, 8.89f, -1.12f)
                reflectiveCurveToRelative(7.88f, 0.86f, 8.89f, 1.12f)
                curveToRelative(0.26f, 0.96f, 1.11f, 4.46f, 1.11f, 8.88f)
                curveToRelative(0f, 4.39f, -0.85f, 7.91f, -1.11f, 8.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 5.72f)
                curveToRelative(-2.31f, 0.01f, -3.6f, 1.33f, -3.65f, 3.71f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.5f, 0.49f, 0.51f)
                curveToRelative(0.3f, 0.01f, 0.5f, -0.21f, 0.51f, -0.49f)
                curveToRelative(0.03f, -1.85f, 0.88f, -2.72f, 2.65f, -2.73f)
                curveToRelative(1.75f, 0.01f, 2.62f, 0.91f, 2.65f, 2.71f)
                curveToRelative(-0.03f, 1.88f, -0.85f, 2.72f, -2.65f, 2.73f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(1.95f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.48f)
                curveToRelative(2.02f, -0.18f, 3.11f, -1.45f, 3.15f, -3.71f)
                curveToRelative(-0.04f, -2.38f, -1.34f, -3.7f, -3.65f, -3.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17.78f)
                moveToRelative(-0.74f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.49f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.49f, 0f)
            }
        }.also { _QuestionSquare = it}
