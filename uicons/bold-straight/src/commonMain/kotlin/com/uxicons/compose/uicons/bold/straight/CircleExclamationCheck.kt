package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Bs.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
                moveTo(8.5f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.9f, 9.06f)
                lineToRelative(-3.94f, 3.94f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(3.94f, -3.94f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(14.94f, 16.95f)
                curveToRelative(-1.27f, 1.26f, -3.01f, 2.05f, -4.94f, 2.05f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                curveToRelative(2.27f, 0f, 4.28f, 1.09f, 5.56f, 2.77f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(-1.37f, -3.9f, -5.07f, -6.7f, -9.43f, -6.7f)
                curveTo(4.49f, 2f, 0f, 6.49f, 0f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(3.26f, 0f, 6.16f, -1.58f, 7.98f, -4.0f)
                curveToRelative(-0.01f, 0f, -0.01f, 0.0f, -0.02f, 0.0f)
                curveToRelative(-1.11f, 0f, -2.16f, -0.38f, -3.02f, -1.04f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
