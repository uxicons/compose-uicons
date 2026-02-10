package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Tc.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(23f, 16.5f)
                curveToRelative(0f, 0.2f, -0.12f, 0.39f, -0.31f, 0.46f)
                curveToRelative(-0.18f, 0.08f, -0.4f, 0.04f, -0.55f, -0.11f)
                curveToRelative(-1.72f, -1.72f, -3.33f, -2.43f, -4.16f, -2.71f)
                curveToRelative(-0.2f, 6.2f, -3.37f, 8.85f, -10.49f, 8.85f)
                curveToRelative(-0.2f, 0f, -0.39f, -0.12f, -0.46f, -0.31f)
                reflectiveCurveToRelative(-0.03f, -0.4f, 0.11f, -0.55f)
                curveToRelative(1.72f, -1.72f, 2.43f, -3.33f, 2.7f, -4.16f)
                curveToRelative(-6.19f, -0.2f, -8.85f, -3.37f, -8.85f, -10.49f)
                curveToRelative(0f, -0.2f, 0.12f, -0.39f, 0.31f, -0.46f)
                curveToRelative(0.19f, -0.08f, 0.4f, -0.04f, 0.55f, 0.11f)
                curveToRelative(1.72f, 1.72f, 3.33f, 2.43f, 4.16f, 2.71f)
                curveToRelative(0.2f, -6.2f, 3.37f, -8.85f, 10.49f, -8.85f)
                curveToRelative(0.2f, 0f, 0.39f, 0.12f, 0.46f, 0.31f)
                reflectiveCurveToRelative(0.03f, 0.4f, -0.11f, 0.55f)
                curveToRelative(-1.72f, 1.72f, -2.43f, 3.33f, -2.7f, 4.16f)
                curveToRelative(6.19f, 0.2f, 8.85f, 3.37f, 8.85f, 10.49f)
                close()
                moveTo(21.98f, 15.34f)
                curveToRelative(-0.27f, -5.98f, -2.72f, -8.34f, -8.47f, -8.34f)
                curveToRelative(-0.15f, 0f, -0.28f, -0.06f, -0.38f, -0.17f)
                curveToRelative(-0.1f, -0.11f, -0.14f, -0.26f, -0.11f, -0.4f)
                curveToRelative(0.01f, -0.09f, 0.35f, -2.06f, 2.33f, -4.4f)
                curveToRelative(-5.98f, 0.27f, -8.34f, 2.72f, -8.34f, 8.47f)
                curveToRelative(0f, 0.15f, -0.06f, 0.28f, -0.17f, 0.38f)
                curveToRelative(-0.11f, 0.1f, -0.26f, 0.14f, -0.4f, 0.11f)
                curveToRelative(-0.09f, -0.01f, -2.06f, -0.34f, -4.4f, -2.33f)
                curveToRelative(0.27f, 5.98f, 2.72f, 8.34f, 8.47f, 8.34f)
                curveToRelative(0.15f, 0f, 0.28f, 0.06f, 0.38f, 0.17f)
                curveToRelative(0.1f, 0.11f, 0.14f, 0.26f, 0.11f, 0.4f)
                curveToRelative(-0.01f, 0.09f, -0.35f, 2.06f, -2.33f, 4.4f)
                curveToRelative(5.98f, -0.27f, 8.34f, -2.72f, 8.34f, -8.47f)
                curveToRelative(0f, -0.15f, 0.06f, -0.28f, 0.17f, -0.38f)
                curveToRelative(0.11f, -0.1f, 0.26f, -0.14f, 0.4f, -0.11f)
                curveToRelative(0.09f, 0.01f, 2.06f, 0.34f, 4.4f, 2.33f)
                close()
            }
        }.also { _Galaxy = it}
