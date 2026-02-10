package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Bs.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17.61f, 6.17f)
                curveToRelative(-1.3f, -3.09f, -4.27f, -5.17f, -7.52f, -5.17f)
                curveTo(5.55f, 1f, 2f, 4.51f, 2f, 9f)
                curveToRelative(0f, 0.57f, 0.08f, 1.51f, 0.21f, 2.37f)
                curveToRelative(-1.39f, 1.13f, -2.21f, 2.82f, -2.21f, 4.63f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.09f, 0.61f, -2.09f, 1.58f, -2.62f)
                lineToRelative(1.02f, -0.55f)
                lineToRelative(-0.27f, -1.12f)
                curveToRelative(-0.18f, -0.75f, -0.33f, -2.09f, -0.33f, -2.7f)
                curveToRelative(0f, -2.85f, 2.19f, -5f, 5.09f, -5f)
                curveToRelative(2.17f, 0f, 4.22f, 1.59f, 4.93f, 3.81f)
                lineToRelative(0.13f, 1.12f)
                lineToRelative(1.23f, 0.1f)
                curveToRelative(2.59f, 0.2f, 4.61f, 2.39f, 4.61f, 4.98f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.81f, -2.73f, -7.07f, -6.38f, -7.83f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _CloudExclamation = it}
