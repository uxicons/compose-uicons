package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Tc.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.98f, 14.11f)
                curveToRelative(-1.05f, 0f, -1.91f, -0.67f, -2.55f, -1.31f)
                curveToRelative(-0.9f, -0.9f, -1.32f, -1.71f, -1.32f, -2.55f)
                curveToRelative(0f, -0.85f, 0.43f, -1.69f, 1.32f, -2.58f)
                curveToRelative(2.3f, -2.3f, 4.04f, -1.1f, 5.14f, 0f)
                curveToRelative(0.9f, 0.9f, 1.32f, 1.7f, 1.32f, 2.55f)
                curveToRelative(0f, 0.85f, -0.43f, 1.7f, -1.32f, 2.58f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.96f, 0.96f, -1.83f, 1.31f, -2.59f, 1.31f)
                close()
                moveTo(12.02f, 7.36f)
                curveToRelative(-0.56f, 0f, -1.16f, 0.3f, -1.88f, 1.02f)
                curveToRelative(-0.69f, 0.69f, -1.02f, 1.3f, -1.02f, 1.87f)
                curveToRelative(0f, 0.56f, 0.33f, 1.15f, 1.02f, 1.84f)
                curveToRelative(1.15f, 1.15f, 2.17f, 1.55f, 3.73f, 0f)
                curveToRelative(0.69f, -0.69f, 1.02f, -1.3f, 1.02f, -1.87f)
                curveToRelative(0f, -0.56f, -0.33f, -1.15f, -1.02f, -1.84f)
                curveToRelative(-0.62f, -0.62f, -1.2f, -1.02f, -1.84f, -1.02f)
                close()
                moveTo(14.22f, 12.45f)
                horizontalLineToRelative(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(7.18f, 1.06f, 2.35f, 5.79f, 2.35f, 10.37f)
                curveToRelative(0f, 6.31f, 9f, 12.3f, 9.38f, 12.55f)
                curveToRelative(0.08f, 0.05f, 0.18f, 0.08f, 0.27f, 0.08f)
                curveToRelative(0.1f, 0f, 0.2f, -0.03f, 0.28f, -0.09f)
                curveToRelative(0.38f, -0.26f, 9.26f, -6.4f, 9.37f, -12.57f)
                curveToRelative(-0.15f, -4.74f, -4.83f, -9.28f, -9.66f, -9.34f)
                close()
                moveTo(11.99f, 21.89f)
                curveToRelative(-1.5f, -1.04f, -8.54f, -6.22f, -8.64f, -11.53f)
                curveTo(3.49f, 6.2f, 7.77f, 2.06f, 11.99f, 2f)
                curveToRelative(4.24f, 0.06f, 8.53f, 4.21f, 8.66f, 8.35f)
                curveToRelative(-0.09f, 5.06f, -7.16f, 10.46f, -8.66f, 11.54f)
                close()
            }
        }.also { _Marker = it}
