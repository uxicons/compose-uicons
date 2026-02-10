package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Tr.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.07f, 0.94f)
                curveToRelative(-1.04f, -1.04f, -2.94f, -1.22f, -5.34f, -0.49f)
                curveToRelative(-1.95f, 0.59f, -3.94f, 1.69f, -5.05f, 2.81f)
                curveToRelative(-1.08f, 1.08f, -1.67f, 2.51f, -1.67f, 4.04f)
                curveToRelative(0f, 1.36f, 0.47f, 2.64f, 1.33f, 3.67f)
                lineTo(0.15f, 23.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineTo(13.04f, 11.66f)
                curveToRelative(1.03f, 0.86f, 2.31f, 1.33f, 3.67f, 1.33f)
                curveToRelative(1.52f, 0f, 2.96f, -0.59f, 4.04f, -1.67f)
                curveToRelative(1.11f, -1.11f, 2.22f, -3.1f, 2.81f, -5.05f)
                curveToRelative(0.73f, -2.4f, 0.55f, -4.3f, -0.49f, -5.34f)
                close()
                moveTo(22.6f, 5.99f)
                curveToRelative(-0.54f, 1.78f, -1.57f, 3.64f, -2.56f, 4.63f)
                curveToRelative(-0.89f, 0.89f, -2.07f, 1.38f, -3.33f, 1.38f)
                reflectiveCurveToRelative(-2.44f, -0.49f, -3.33f, -1.38f)
                reflectiveCurveToRelative(-1.38f, -2.07f, -1.38f, -3.33f)
                reflectiveCurveToRelative(0.49f, -2.44f, 1.38f, -3.33f)
                curveToRelative(0.99f, -0.99f, 2.85f, -2.02f, 4.63f, -2.56f)
                curveToRelative(0.88f, -0.27f, 1.68f, -0.4f, 2.36f, -0.4f)
                curveToRelative(0.87f, 0f, 1.56f, 0.22f, 1.98f, 0.64f)
                curveToRelative(0.76f, 0.76f, 0.85f, 2.34f, 0.24f, 4.34f)
                close()
            }
        }.also { _Spoon = it}
