package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiraSign: ImageVector? = null

val Icons.Tr.LiraSign: ImageVector
    get() = _LiraSign ?: UXIcon(name = "LiraSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 5.24f, -4.26f, 9.5f, -9.5f, 9.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7.97f)
                lineToRelative(7.66f, -2.55f)
                curveToRelative(0.26f, -0.09f, 0.4f, -0.37f, 0.32f, -0.63f)
                curveToRelative(-0.09f, -0.26f, -0.37f, -0.4f, -0.63f, -0.32f)
                lineToRelative(-7.34f, 2.45f)
                verticalLineToRelative(-2.94f)
                lineToRelative(7.66f, -2.55f)
                curveToRelative(0.26f, -0.09f, 0.4f, -0.37f, 0.32f, -0.63f)
                curveToRelative(-0.09f, -0.26f, -0.37f, -0.41f, -0.63f, -0.32f)
                lineToRelative(-7.34f, 2.45f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(7.81f)
                lineToRelative(-3.66f, 1.22f)
                curveToRelative(-0.26f, 0.09f, -0.4f, 0.37f, -0.32f, 0.63f)
                curveToRelative(0.07f, 0.21f, 0.27f, 0.34f, 0.47f, 0.34f)
                curveToRelative(0.05f, 0f, 0.1f, -0.01f, 0.16f, -0.03f)
                lineToRelative(3.34f, -1.11f)
                verticalLineToRelative(2.94f)
                lineToRelative(-3.66f, 1.22f)
                curveToRelative(-0.26f, 0.09f, -0.4f, 0.37f, -0.32f, 0.63f)
                curveToRelative(0.07f, 0.21f, 0.27f, 0.34f, 0.47f, 0.34f)
                curveToRelative(0.05f, 0f, 0.1f, -0.01f, 0.16f, -0.03f)
                lineToRelative(3.34f, -1.11f)
                verticalLineToRelative(7.64f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2f)
                curveToRelative(5.79f, 0f, 10.5f, -4.71f, 10.5f, -10.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _LiraSign = it}
