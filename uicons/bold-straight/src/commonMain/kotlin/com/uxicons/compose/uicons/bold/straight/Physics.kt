package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Physics: ImageVector? = null

val Icons.Bs.Physics: ImageVector
    get() = _Physics ?: UXIcon(name = "Physics") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.4f, 1.59f)
                curveToRelative(-1.81f, -1.81f, -5f, -2.76f, -10.42f, 1.01f)
                curveToRelative(-5.41f, -3.77f, -8.61f, -2.81f, -10.41f, -1.01f)
                reflectiveCurveToRelative(-2.76f, 5.0f, 1.01f, 10.41f)
                curveToRelative(-3.77f, 5.41f, -2.81f, 8.6f, -1.01f, 10.41f)
                arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.84f, 1.6f)
                curveToRelative(1.7f, 0f, 3.86f, -0.7f, 6.57f, -2.59f)
                curveToRelative(2.71f, 1.89f, 4.87f, 2.6f, 6.57f, 2.6f)
                arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.84f, -1.6f)
                curveToRelative(1.8f, -1.81f, 2.76f, -5.0f, -1.01f, -10.41f)
                curveToRelative(3.77f, -5.41f, 2.81f, -8.6f, 1.01f, -10.41f)
                close()
                moveTo(18.47f, 3.01f)
                arcToRelative(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, 0.71f)
                curveToRelative(1.35f, 1.35f, 0.58f, 3.6f, -0.82f, 5.8f)
                curveToRelative(-0.71f, -0.82f, -1.49f, -1.68f, -2.4f, -2.58f)
                reflectiveCurveToRelative(-1.76f, -1.69f, -2.58f, -2.4f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, -1.53f)
                close()
                moveTo(17.62f, 12f)
                curveToRelative(-0.97f, 1.17f, -1.96f, 2.21f, -2.69f, 2.94f)
                reflectiveCurveToRelative(-1.77f, 1.72f, -2.95f, 2.69f)
                curveToRelative(-1.17f, -0.97f, -2.21f, -1.96f, -2.94f, -2.69f)
                reflectiveCurveToRelative(-1.72f, -1.77f, -2.69f, -2.94f)
                curveToRelative(0.97f, -1.17f, 1.96f, -2.21f, 2.69f, -2.94f)
                reflectiveCurveToRelative(1.77f, -1.72f, 2.94f, -2.69f)
                curveToRelative(1.17f, 0.97f, 2.21f, 1.96f, 2.95f, 2.69f)
                reflectiveCurveToRelative(1.72f, 1.77f, 2.69f, 2.94f)
                close()
                moveTo(3.69f, 3.71f)
                arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, -0.71f)
                arcToRelative(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, 1.53f)
                curveToRelative(-0.82f, 0.71f, -1.68f, 1.49f, -2.58f, 2.4f)
                reflectiveCurveToRelative(-1.69f, 1.77f, -2.4f, 2.58f)
                curveToRelative(-1.41f, -2.2f, -2.18f, -4.45f, -0.82f, -5.8f)
                close()
                moveTo(3.69f, 20.29f)
                curveToRelative(-1.35f, -1.35f, -0.58f, -3.6f, 0.82f, -5.8f)
                curveToRelative(0.71f, 0.82f, 1.49f, 1.68f, 2.4f, 2.58f)
                reflectiveCurveToRelative(1.76f, 1.7f, 2.58f, 2.4f)
                curveToRelative(-2.21f, 1.4f, -4.45f, 2.17f, -5.8f, 0.82f)
                close()
                moveTo(20.27f, 20.29f)
                curveToRelative(-1.35f, 1.35f, -3.6f, 0.59f, -5.8f, -0.82f)
                curveToRelative(0.82f, -0.7f, 1.68f, -1.5f, 2.58f, -2.4f)
                reflectiveCurveToRelative(1.69f, -1.76f, 2.4f, -2.58f)
                curveToRelative(1.4f, 2.2f, 2.17f, 4.45f, 0.82f, 5.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _Physics = it}
