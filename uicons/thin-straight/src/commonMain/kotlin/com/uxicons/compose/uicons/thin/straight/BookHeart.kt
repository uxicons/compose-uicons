package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookHeart: ImageVector? = null

val Icons.Ts.BookHeart: ImageVector
    get() = _BookHeart ?: UXIcon(name = "BookHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.71f, 15.2f)
                lineToRelative(0.29f, 0.2f)
                lineToRelative(0.29f, -0.2f)
                curveToRelative(0.19f, -0.14f, 4.71f, -3.32f, 4.71f, -6.17f)
                curveToRelative(0f, -1.65f, -1.23f, -3.0f, -2.75f, -3.0f)
                curveToRelative(-0.94f, 0f, -1.77f, 0.49f, -2.27f, 1.25f)
                curveToRelative(-0.49f, -0.76f, -1.29f, -1.25f, -2.23f, -1.25f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.34f, -2.75f, 3.0f)
                curveToRelative(0f, 2.84f, 4.52f, 6.03f, 4.71f, 6.17f)
                close()
                moveTo(9.75f, 7.04f)
                curveToRelative(0.96f, 0f, 1.71f, 0.86f, 1.71f, 1.96f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.08f, 0.8f, -1.96f, 1.79f, -1.96f)
                curveToRelative(0.96f, 0f, 1.75f, 0.9f, 1.75f, 2.0f)
                curveToRelative(0f, 1.79f, -2.66f, 4.14f, -4f, 5.14f)
                curveToRelative(-1.34f, -1.0f, -4f, -3.35f, -4f, -5.14f)
                curveToRelative(0f, -1.1f, 0.79f, -2.0f, 1.75f, -2.0f)
                close()
                moveTo(20.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17.5f)
                lineTo(22f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                lineTo(4.5f, 19f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.2f, -1.5f, 0.51f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(16.5f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 23f)
                close()
            }
        }.also { _BookHeart = it}
