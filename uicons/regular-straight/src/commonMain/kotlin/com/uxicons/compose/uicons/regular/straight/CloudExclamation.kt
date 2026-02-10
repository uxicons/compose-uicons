package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Rs.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                close()
                moveTo(11f, 23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.8f, 7.2f)
                curveToRelative(-0.82f, -3.58f, -4.05f, -6.2f, -7.8f, -6.2f)
                curveTo(5.59f, 1f, 2f, 4.59f, 2f, 9f)
                curveToRelative(0f, 1.29f, 0.3f, 2.54f, 0.88f, 3.66f)
                curveToRelative(-1.75f, 0.94f, -2.88f, 2.79f, -2.88f, 4.84f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.59f, 1.07f, -2.98f, 2.61f, -3.39f)
                lineToRelative(1.43f, -0.37f)
                lineToRelative(-0.88f, -1.19f)
                curveToRelative(-0.76f, -1.03f, -1.17f, -2.26f, -1.17f, -3.55f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(2.99f, 0f, 5.55f, 2.23f, 5.95f, 5.2f)
                lineToRelative(0.1f, 0.76f)
                lineToRelative(0.76f, 0.1f)
                curveToRelative(2.96f, 0.4f, 5.2f, 2.95f, 5.2f, 5.95f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.74f, -2.62f, -6.97f, -6.2f, -7.8f)
                close()
            }
        }.also { _CloudExclamation = it}
