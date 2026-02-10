package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Information: ImageVector? = null

val Icons.Sc.Information: ImageVector
    get() = _Information ?: UXIcon(name = "Information") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.95f, 21.86f)
                curveToRelative(-0.2f, 0.81f, -1.03f, 1.29f, -1.82f, 1.09f)
                curveToRelative(-0.04f, -0.01f, -1.7f, -0.41f, -4.14f, -0.41f)
                curveToRelative(-2.46f, 0f, -4.12f, 0.4f, -4.14f, 0.41f)
                curveToRelative(-0.8f, 0.2f, -1.62f, -0.29f, -1.81f, -1.1f)
                curveToRelative(-0.2f, -0.8f, 0.29f, -1.61f, 1.09f, -1.81f)
                curveToRelative(0.07f, -0.02f, 1.36f, -0.33f, 3.37f, -0.45f)
                lineToRelative(0.05f, -9.05f)
                curveToRelative(0f, -2.31f, -0.63f, -2.55f, -2.06f, -2.55f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(3.35f, 0f, 5.06f, 1.87f, 5.06f, 5.56f)
                lineToRelative(-0.05f, 9.04f)
                curveToRelative(2.0f, 0.12f, 3.29f, 0.43f, 3.36f, 0.45f)
                curveToRelative(0.8f, 0.2f, 1.29f, 1.01f, 1.09f, 1.82f)
                close()
                moveTo(11.5f, 4f)
                curveToRelative(1.01f, 0f, 1.5f, -0.49f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.49f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.49f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.49f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _Information = it}
