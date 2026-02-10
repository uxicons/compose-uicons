package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Sc.QuestionSquare: ImageVector
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
                moveTo(12f, 19.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 12.64f)
                verticalLineToRelative(1.36f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.27f)
                curveToRelative(0f, -0.55f, 0.44f, -1.0f, 0.99f, -1f)
                curveToRelative(1.44f, -0.01f, 1.98f, -0.57f, 2.01f, -2.09f)
                curveToRelative(-0.02f, -1.42f, -0.62f, -2.04f, -2.01f, -2.05f)
                curveToRelative(-1.39f, 0.01f, -1.97f, 0.61f, -1.99f, 2.09f)
                curveToRelative(-0.01f, 0.55f, -0.44f, 1.01f, -1.02f, 0.98f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.98f, -1.02f)
                curveToRelative(0.04f, -2.56f, 1.5f, -4.04f, 3.99f, -4.05f)
                curveToRelative(2.47f, 0.02f, 3.96f, 1.53f, 4.01f, 4.05f)
                curveToRelative(-0.04f, 2.27f, -1.1f, 3.65f, -3f, 4.0f)
                close()
            }
        }.also { _QuestionSquare = it}
