package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Rs.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.57f)
                verticalLineToRelative(15.43f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-18f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.05f)
                curveToRelative(-0.03f, 0.25f, -0.06f, 0.51f, -0.06f, 0.77f)
                curveToRelative(0f, 0.42f, 0.06f, 0.83f, 0.15f, 1.23f)
                horizontalLineToRelative(-7.15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(1.97f, -1.97f)
                curveToRelative(0.12f, 0.08f, 1.73f, 1.09f, 1.73f, 1.09f)
                lineToRelative(-2.28f, 2.28f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineToRelative(-6.46f, -6.47f)
                verticalLineToRelative(12.93f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-11.41f)
                curveToRelative(0.67f, -0.57f, 1.37f, -1.25f, 2f, -2.02f)
                close()
                moveTo(12f, 3.77f)
                curveToRelative(0f, -2.08f, 1.57f, -3.77f, 3.5f, -3.77f)
                curveToRelative(0.92f, 0f, 1.83f, 0.34f, 2.5f, 1.06f)
                curveToRelative(0.67f, -0.72f, 1.58f, -1.06f, 2.5f, -1.06f)
                curveToRelative(1.93f, 0f, 3.5f, 1.69f, 3.5f, 3.77f)
                curveToRelative(0f, 3.36f, -4.91f, 6.54f, -5.47f, 6.89f)
                lineToRelative(-0.53f, 0.34f)
                lineToRelative(-0.53f, -0.34f)
                curveToRelative(-0.56f, -0.35f, -5.47f, -3.54f, -5.47f, -6.89f)
                close()
                moveTo(14f, 3.77f)
                curveToRelative(0f, 1.68f, 2.57f, 3.84f, 4.0f, 4.85f)
                curveToRelative(1.73f, -1.21f, 4.0f, -3.3f, 4.0f, -4.85f)
                curveToRelative(0f, -0.98f, -0.67f, -1.77f, -1.5f, -1.77f)
                curveToRelative(-0.95f, 0f, -1.5f, 0.73f, -1.5f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.27f, -0.55f, -2f, -1.5f, -2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.8f, -1.5f, 1.77f)
                close()
            }
        }.also { _EmailHeart = it}
