package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeAlt: ImageVector? = null

val Icons.Rs.TreeAlt: ImageVector
    get() = _TreeAlt ?: UXIcon(name = "TreeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.73f, 21f)
                lineToRelative(-3.48f, -6f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-3.96f, -6f)
                horizontalLineToRelative(2.15f)
                lineTo(14.11f, 0.99f)
                curveToRelative(-0.5f, -0.63f, -1.26f, -0.99f, -2.11f, -0.99f)
                reflectiveCurveToRelative(-1.61f, 0.36f, -2.11f, 0.99f)
                lineToRelative(-4.73f, 8.01f)
                horizontalLineToRelative(2.15f)
                lineToRelative(-3.96f, 6f)
                horizontalLineToRelative(2.44f)
                lineToRelative(-3.25f, 6f)
                horizontalLineToRelative(8.45f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.73f)
                close()
                moveTo(5.91f, 19f)
                lineToRelative(3.25f, -6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.96f, -6f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(2.83f, -4.81f)
                curveToRelative(0.23f, -0.24f, 0.78f, -0.24f, 1.01f, 0f)
                lineToRelative(2.83f, 4.81f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(3.96f, 6f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(3.48f, 6f)
                horizontalLineToRelative(-5.26f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-5.09f)
                close()
            }
        }.also { _TreeAlt = it}
