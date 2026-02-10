package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerClick: ImageVector? = null

val Icons.Ts.MousePointerClick: ImageVector
    get() = _MousePointerClick ?: UXIcon(name = "MousePointerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(3.72f, 3.43f)
                lineTo(7.25f, 6.96f)
                lineTo(7.96f, 6.26f)
                lineTo(4.43f, 2.72f)
                close()
                moveTo(1f, 11f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.01f, -1f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(19.28f, 3.43f)
                lineTo(18.57f, 2.72f)
                lineTo(15.03f, 6.26f)
                lineTo(15.74f, 6.96f)
                close()
                moveTo(17.53f, 18.07f)
                lineTo(19.79f, 22.3f)
                lineTo(16.44f, 23.97f)
                lineTo(14.1f, 19.59f)
                lineTo(10.0f, 23.42f)
                verticalLineToRelative(-14.03f)
                curveToRelative(0f, -0.28f, 0.09f, -0.56f, 0.26f, -0.79f)
                curveToRelative(0.42f, -0.56f, 1.23f, -0.7f, 1.76f, -0.29f)
                lineToRelative(10.71f, 9.17f)
                lineToRelative(-5.21f, 0.58f)
                close()
                moveTo(15.95f, 17.24f)
                lineTo(20.34f, 16.75f)
                lineTo(11.51f, 9.19f)
                curveToRelative(-0.2f, -0.17f, -0.51f, -0.13f, -0.51f, 0.2f)
                verticalLineToRelative(11.73f)
                lineToRelative(3.37f, -3.14f)
                lineToRelative(2.5f, 4.67f)
                lineToRelative(1.55f, -0.78f)
                lineToRelative(-2.47f, -4.63f)
                close()
            }
        }.also { _MousePointerClick = it}
