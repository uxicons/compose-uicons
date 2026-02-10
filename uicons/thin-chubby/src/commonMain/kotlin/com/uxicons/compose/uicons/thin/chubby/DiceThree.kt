package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceThree: ImageVector? = null

val Icons.Tc.DiceThree: ImageVector
    get() = _DiceThree ?: UXIcon(name = "DiceThree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.25f, 7.24f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 11.99f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.77f, 16.75f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                curveToRelative(-5.0f, 0f, -9.23f, -1.18f, -9.4f, -1.23f)
                curveToRelative(-0.16f, -0.05f, -0.29f, -0.17f, -0.34f, -0.34f)
                curveToRelative(-0.05f, -0.16f, -1.23f, -4.08f, -1.23f, -9.44f)
                curveTo(1.03f, 6.69f, 2.2f, 2.73f, 2.25f, 2.56f)
                curveToRelative(0.05f, -0.16f, 0.18f, -0.29f, 0.34f, -0.34f)
                curveToRelative(0.18f, -0.05f, 4.41f, -1.23f, 9.4f, -1.23f)
                reflectiveCurveToRelative(9.23f, 1.18f, 9.4f, 1.23f)
                curveToRelative(0.16f, 0.05f, 0.29f, 0.17f, 0.34f, 0.34f)
                curveToRelative(0.05f, 0.17f, 1.23f, 4.08f, 1.23f, 9.44f)
                curveToRelative(0f, 5.31f, -1.18f, 9.27f, -1.23f, 9.44f)
                curveToRelative(-0.05f, 0.16f, -0.18f, 0.29f, -0.34f, 0.34f)
                curveToRelative(-0.18f, 0.05f, -4.41f, 1.23f, -9.4f, 1.23f)
                close()
                moveTo(3.13f, 20.88f)
                curveToRelative(1.01f, 0.26f, 4.71f, 1.12f, 8.87f, 1.12f)
                reflectiveCurveToRelative(7.86f, -0.86f, 8.86f, -1.12f)
                curveToRelative(0.26f, -0.97f, 1.11f, -4.49f, 1.11f, -8.88f)
                curveToRelative(0f, -4.43f, -0.85f, -7.92f, -1.11f, -8.88f)
                curveToRelative(-1.01f, -0.26f, -4.71f, -1.12f, -8.87f, -1.12f)
                reflectiveCurveToRelative(-7.86f, 0.86f, -8.86f, 1.12f)
                curveToRelative(-0.26f, 0.97f, -1.11f, 4.49f, -1.11f, 8.88f)
                curveToRelative(0f, 4.42f, 0.85f, 7.92f, 1.11f, 8.88f)
                close()
            }
        }.also { _DiceThree = it}
