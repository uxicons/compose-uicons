package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookmark: ImageVector? = null

val Icons.Tr.CircleBookmark: ImageVector
    get() = _CircleBookmark ?: UXIcon(name = "CircleBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(14.5f, 6f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.18f)
                curveToRelative(0f, 0.54f, 0.32f, 1.01f, 0.81f, 1.22f)
                curveToRelative(0.5f, 0.21f, 1.05f, 0.1f, 1.44f, -0.29f)
                lineToRelative(2.75f, -2.75f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.26f, 0.26f, 0.58f, 0.39f, 0.92f, 0.39f)
                curveToRelative(0.17f, 0f, 0.34f, -0.03f, 0.51f, -0.1f)
                curveToRelative(0.49f, -0.2f, 0.81f, -0.68f, 0.81f, -1.22f)
                verticalLineToRelative(-8.18f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16f, 16.68f)
                curveToRelative(0f, 0.19f, -0.14f, 0.27f, -0.2f, 0.29f)
                curveToRelative(-0.06f, 0.02f, -0.21f, 0.07f, -0.35f, -0.07f)
                lineToRelative(-3.46f, -3.46f)
                lineToRelative(-3.46f, 3.46f)
                curveToRelative(-0.14f, 0.14f, -0.29f, 0.09f, -0.35f, 0.07f)
                curveToRelative(-0.06f, -0.02f, -0.2f, -0.1f, -0.2f, -0.29f)
                verticalLineToRelative(-8.18f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.18f)
                close()
            }
        }.also { _CircleBookmark = it}
