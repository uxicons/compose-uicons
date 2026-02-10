package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glucose: ImageVector? = null

val Icons.Ss.Glucose: ImageVector
    get() = _Glucose ?: UXIcon(name = "Glucose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 21.89f)
                lineToRelative(2.86f, 1.69f)
                curveToRelative(-0.92f, 0.27f, -1.89f, 0.42f, -2.86f, 0.42f)
                curveToRelative(-5.54f, -0.0f, -10.05f, -4.51f, -10.05f, -10.05f)
                curveToRelative(0.08f, -5.16f, 6.26f, -10.78f, 10.0f, -13.89f)
                curveToRelative(2.26f, 1.66f, 4.59f, 3.92f, 6.84f, 6.66f)
                curveToRelative(0.63f, 0.8f, 1.16f, 1.56f, 1.6f, 2.31f)
                curveToRelative(-0.72f, -0.07f, -1.45f, 0.06f, -2.12f, 0.38f)
                lineToRelative(-6.27f, 4.1f)
                close()
                moveTo(12f, 20.73f)
                curveToRelative(0.03f, 0.01f, 4.97f, 2.99f, 5f, 3.0f)
                verticalLineToRelative(-5.33f)
                lineToRelative(-5f, -3f)
                verticalLineToRelative(5.33f)
                close()
                moveTo(19f, 18.4f)
                verticalLineToRelative(5.33f)
                curveToRelative(0.01f, -0.01f, 5f, -3.0f, 5f, -3.0f)
                verticalLineToRelative(-5.33f)
                close()
                moveTo(19.03f, 11.29f)
                curveToRelative(-0.64f, -0.38f, -1.42f, -0.38f, -2.06f, 0f)
                lineToRelative(-3.97f, 2.38f)
                lineToRelative(5f, 3f)
                lineToRelative(5f, -3f)
                lineToRelative(-3.97f, -2.38f)
                close()
            }
        }.also { _Glucose = it}
