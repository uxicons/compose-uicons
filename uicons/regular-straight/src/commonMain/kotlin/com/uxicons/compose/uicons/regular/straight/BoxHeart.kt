package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxHeart: ImageVector? = null

val Icons.Rs.BoxHeart: ImageVector
    get() = _BoxHeart ?: UXIcon(name = "BoxHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.46f, 19.84f)
                lineToRelative(0.54f, 0.35f)
                lineToRelative(0.54f, -0.35f)
                curveToRelative(0.46f, -0.29f, 4.46f, -2.95f, 4.46f, -5.68f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 2.73f, 4.0f, 5.39f, 4.46f, 5.68f)
                close()
                moveTo(10f, 13f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                curveToRelative(0f, 1.04f, -1.61f, 2.62f, -3f, 3.63f)
                curveToRelative(-1.39f, -1.01f, -3f, -2.59f, -3f, -3.63f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                close()
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 22f)
                lineTo(3f, 22f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(13f)
                close()
                moveTo(22f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _BoxHeart = it}
