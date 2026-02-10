package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Rs.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveTo(9f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14.46f, 10.28f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.78f, 2.7f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.59f, 1.42f, 0.59f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(5.29f, -5.21f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-5.31f, 5.2f)
                lineToRelative(-2.79f, -2.71f)
                close()
                moveTo(16.33f, 16.88f)
                curveToRelative(-1.46f, 1.89f, -3.75f, 3.12f, -6.33f, 3.12f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(5.59f, 4f, 10f, 4f)
                curveToRelative(3.64f, 0f, 6.71f, 2.44f, 7.68f, 5.77f)
                lineToRelative(1.58f, -1.54f)
                curveToRelative(-1.49f, -3.65f, -5.08f, -6.22f, -9.25f, -6.22f)
                curveTo(4.49f, 2f, 0f, 6.49f, 0f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(3.82f, 0f, 7.15f, -2.16f, 8.83f, -5.32f)
                curveToRelative(-0.49f, 0.21f, -1.02f, 0.32f, -1.57f, 0.32f)
                curveToRelative(-0.32f, 0f, -0.63f, -0.05f, -0.94f, -0.12f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
