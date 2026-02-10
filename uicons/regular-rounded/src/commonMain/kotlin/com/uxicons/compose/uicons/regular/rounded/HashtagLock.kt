package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HashtagLock: ImageVector? = null

val Icons.Rr.HashtagLock: ImageVector
    get() = _HashtagLock ?: UXIcon(name = "HashtagLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 15f)
                horizontalLineToRelative(-0.79f)
                lineToRelative(0.72f, -6f)
                horizontalLineToRelative(4.15f)
                curveToRelative(0.29f, 0f, 0.56f, -0.13f, 0.78f, -0.33f)
                curveToRelative(1.08f, -1.03f, 2.53f, -1.67f, 4.14f, -1.67f)
                curveToRelative(1.77f, 0f, 3.36f, 0.78f, 4.46f, 2f)
                horizontalLineToRelative(0.54f)
                curveToRelative(0.51f, 0f, 0.93f, -0.38f, 0.99f, -0.88f)
                curveToRelative(0.07f, -0.59f, -0.4f, -1.12f, -0.99f, -1.12f)
                horizontalLineToRelative(-4.95f)
                lineToRelative(0.71f, -5.88f)
                curveToRelative(0.07f, -0.59f, -0.39f, -1.12f, -0.99f, -1.12f)
                curveToRelative(-0.51f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                lineToRelative(-0.73f, 6.12f)
                horizontalLineToRelative(-6.87f)
                lineToRelative(0.71f, -5.88f)
                curveToRelative(0.07f, -0.55f, -0.33f, -1.05f, -0.87f, -1.11f)
                curveToRelative(-0.55f, -0.07f, -1.05f, 0.33f, -1.11f, 0.87f)
                lineToRelative(-0.73f, 6.12f)
                horizontalLineTo(1.83f)
                curveToRelative(-0.51f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                curveToRelative(-0.07f, 0.59f, 0.4f, 1.12f, 0.99f, 1.12f)
                horizontalLineToRelative(5.09f)
                lineToRelative(-0.72f, 6f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.96f)
                lineToRelative(-0.71f, 5.88f)
                curveToRelative(-0.07f, 0.55f, 0.33f, 1.05f, 0.87f, 1.11f)
                curveToRelative(0.58f, 0f, 1.05f, -0.37f, 1.11f, -0.87f)
                lineToRelative(0.73f, -6.12f)
                horizontalLineToRelative(1.03f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 19f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.56f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _HashtagLock = it}
