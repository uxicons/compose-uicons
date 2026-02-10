package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Rs.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.91f, 6.55f)
                curveToRelative(-0.69f, -0.52f, -1.56f, -0.68f, -2.4f, -0.44f)
                lineToRelative(-1.32f, 0.38f)
                curveToRelative(-0.46f, 0.13f, -0.86f, 0.37f, -1.2f, 0.67f)
                curveToRelative(-0.34f, -0.31f, -0.74f, -0.54f, -1.2f, -0.67f)
                lineToRelative(-1.32f, -0.38f)
                curveToRelative(-0.83f, -0.24f, -1.7f, -0.08f, -2.4f, 0.44f)
                curveToRelative(-0.69f, 0.52f, -1.09f, 1.31f, -1.09f, 2.18f)
                verticalLineToRelative(7.59f)
                lineToRelative(6f, 1.72f)
                lineToRelative(6f, -1.72f)
                verticalLineToRelative(-7.59f)
                curveToRelative(0f, -0.86f, -0.4f, -1.66f, -1.09f, -2.18f)
                close()
                moveTo(11f, 15.67f)
                lineToRelative(-3f, -0.86f)
                verticalLineToRelative(-6.09f)
                curveToRelative(0f, -0.23f, 0.1f, -0.44f, 0.29f, -0.58f)
                curveToRelative(0.18f, -0.14f, 0.41f, -0.18f, 0.64f, -0.12f)
                lineToRelative(1.32f, 0.38f)
                curveToRelative(0.45f, 0.13f, 0.76f, 0.54f, 0.76f, 1.01f)
                verticalLineToRelative(6.26f)
                close()
                moveTo(16f, 14.81f)
                lineToRelative(-3f, 0.86f)
                verticalLineToRelative(-6.26f)
                curveToRelative(0f, -0.46f, 0.31f, -0.88f, 0.76f, -1.01f)
                lineToRelative(1.32f, -0.38f)
                curveToRelative(0.22f, -0.06f, 0.45f, -0.02f, 0.64f, 0.12f)
                curveToRelative(0.18f, 0.14f, 0.29f, 0.35f, 0.29f, 0.58f)
                verticalLineToRelative(6.09f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _CircleBookOpen = it}
