package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxHeart: ImageVector? = null

val Icons.Tr.BoxHeart: ImageVector
    get() = _BoxHeart ?: UXIcon(name = "BoxHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.81f, 0.4f, 1.53f, 1.0f, 1.99f)
                curveToRelative(0f, 0.0f, -0.0f, 0.01f, -0.0f, 0.01f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(23f, 7.5f)
                reflectiveCurveToRelative(-0.0f, -0.01f, -0.0f, -0.01f)
                curveToRelative(0.6f, -0.46f, 1.0f, -1.18f, 1.0f, -1.99f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(22f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 7.95f)
                curveToRelative(0.16f, 0.03f, 0.33f, 0.05f, 0.5f, 0.05f)
                horizontalLineToRelative(19f)
                curveToRelative(0.17f, 0f, 0.34f, -0.02f, 0.5f, -0.05f)
                verticalLineToRelative(11.55f)
                close()
                moveTo(23f, 5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(14.13f, 10.9f)
                curveToRelative(-0.96f, 0f, -1.76f, 0.41f, -2.25f, 1.09f)
                curveToRelative(-0.48f, -0.68f, -1.29f, -1.09f, -2.25f, -1.09f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0f, 2.12f, 2.55f, 4.71f, 3.9f, 5.78f)
                curveToRelative(0.33f, 0.26f, 0.71f, 0.39f, 1.1f, 0.39f)
                reflectiveCurveToRelative(0.78f, -0.13f, 1.1f, -0.39f)
                curveToRelative(1.35f, -1.07f, 3.9f, -3.67f, 3.9f, -5.78f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                close()
                moveTo(12.36f, 18.83f)
                curveToRelative(-0.28f, 0.23f, -0.68f, 0.23f, -0.96f, 0f)
                curveToRelative(-1.46f, -1.17f, -3.52f, -3.49f, -3.52f, -5f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                curveToRelative(1.03f, 0f, 1.75f, 0.7f, 1.75f, 1.71f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.01f, 0.72f, -1.71f, 1.75f, -1.71f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.51f, -2.06f, 3.83f, -3.52f, 5f)
                close()
            }
        }.also { _BoxHeart = it}
