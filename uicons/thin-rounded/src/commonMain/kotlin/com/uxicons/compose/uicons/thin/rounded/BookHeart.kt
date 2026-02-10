package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookHeart: ImageVector? = null

val Icons.Tr.BookHeart: ImageVector
    get() = _BookHeart ?: UXIcon(name = "BookHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(5.5f, 17f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.41f, -2.5f, 1.06f)
                lineTo(3f, 4.5f)
                close()
                moveTo(17.5f, 23f)
                lineTo(5.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(10.9f, 13.61f)
                curveToRelative(0.33f, 0.26f, 0.71f, 0.39f, 1.1f, 0.39f)
                reflectiveCurveToRelative(0.78f, -0.13f, 1.1f, -0.39f)
                curveToRelative(1.17f, -0.94f, 3.9f, -3.37f, 3.9f, -5.61f)
                curveToRelative(0f, -1.65f, -1.23f, -3.0f, -2.75f, -3.0f)
                curveToRelative(-0.94f, 0f, -1.77f, 0.49f, -2.27f, 1.25f)
                curveToRelative(-0.49f, -0.76f, -1.29f, -1.25f, -2.23f, -1.25f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.34f, -2.75f, 3.0f)
                curveToRelative(0f, 2.24f, 2.72f, 4.67f, 3.9f, 5.61f)
                close()
                moveTo(9.75f, 6f)
                curveToRelative(0.96f, 0f, 1.71f, 0.86f, 1.71f, 1.96f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.08f, 0.8f, -1.96f, 1.79f, -1.96f)
                curveToRelative(0.96f, 0f, 1.75f, 0.9f, 1.75f, 2.0f)
                curveToRelative(0f, 1.48f, -1.82f, 3.46f, -3.52f, 4.83f)
                curveToRelative(-0.28f, 0.23f, -0.67f, 0.23f, -0.95f, 0f)
                curveToRelative(-1.7f, -1.37f, -3.52f, -3.36f, -3.52f, -4.83f)
                curveToRelative(0f, -1.1f, 0.79f, -2.0f, 1.75f, -2.0f)
                close()
            }
        }.also { _BookHeart = it}
