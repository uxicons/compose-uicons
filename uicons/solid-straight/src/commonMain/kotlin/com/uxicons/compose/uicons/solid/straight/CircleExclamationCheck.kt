package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Ss.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.94f, 15f)
                curveToRelative(-0.51f, 0f, -1.02f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-2.37f, -2.29f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.38f, 2.29f)
                lineToRelative(4.67f, -4.56f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-4.65f, 4.56f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                close()
                moveTo(16.63f, 16.78f)
                curveToRelative(-1.59f, 2.54f, -4.41f, 4.22f, -7.63f, 4.22f)
                curveTo(4.03f, 21f, 0f, 16.97f, 0f, 12f)
                reflectiveCurveTo(4.03f, 3f, 9f, 3f)
                curveToRelative(4.31f, 0f, 7.91f, 3.03f, 8.79f, 7.08f)
                lineToRelative(-2.29f, -2.21f)
                lineToRelative(-4.18f, 4.31f)
                lineToRelative(3.79f, 3.65f)
                curveToRelative(0.43f, 0.43f, 0.95f, 0.76f, 1.51f, 0.95f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
