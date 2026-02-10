package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCard: ImageVector? = null

val Icons.Rs.SimCard: ImageVector
    get() = _SimCard ?: UXIcon(name = "SimCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.83f, 4.41f)
                lineToRelative(-3.24f, -3.24f)
                curveToRelative(-0.76f, -0.76f, -1.76f, -1.17f, -2.83f, -1.17f)
                horizontalLineToRelative(-7.76f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(18f)
                lineTo(21f, 7.24f)
                curveToRelative(0f, -1.07f, -0.42f, -2.07f, -1.17f, -2.83f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                lineTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.76f)
                curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.42f, 0.59f)
                lineToRelative(3.24f, 3.24f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.42f)
                verticalLineToRelative(14.76f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(14f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _SimCard = it}
