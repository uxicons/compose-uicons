package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Rc.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.14f, 7.7f)
                curveToRelative(-0.0f, 0.04f, -0.09f, 1.15f, -0.12f, 2.96f)
                curveToRelative(0.95f, 0.14f, 2.62f, 0.34f, 4.49f, 0.34f)
                curveToRelative(0.5f, 0f, 0.99f, -0.01f, 1.45f, -0.04f)
                curveToRelative(0.54f, -0.03f, 1.02f, 0.4f, 1.05f, 0.95f)
                curveToRelative(0.03f, 0.55f, -0.4f, 1.02f, -0.95f, 1.05f)
                curveToRelative(-0.49f, 0.03f, -1.01f, 0.04f, -1.55f, 0.04f)
                curveToRelative(-1.83f, 0f, -3.45f, -0.18f, -4.5f, -0.32f)
                curveToRelative(0.02f, 2.2f, 0.13f, 3.59f, 0.13f, 3.6f)
                curveToRelative(0.21f, 3.67f, 1.18f, 4.72f, 4.36f, 4.72f)
                curveToRelative(0.5f, 0f, 0.96f, -0.03f, 1.35f, -0.09f)
                curveToRelative(0.54f, -0.08f, 1.06f, 0.29f, 1.14f, 0.84f)
                reflectiveCurveToRelative(-0.29f, 1.06f, -0.84f, 1.14f)
                curveToRelative(-0.5f, 0.08f, -1.04f, 0.11f, -1.65f, 0.11f)
                curveToRelative(-5.26f, 0f, -6.17f, -3.16f, -6.36f, -6.58f)
                curveToRelative(-0.0f, -0.04f, -0.14f, -1.73f, -0.14f, -4.42f)
                reflectiveCurveToRelative(0.14f, -4.37f, 0.14f, -4.44f)
                curveToRelative(0.19f, -3.39f, 1.09f, -6.56f, 6.36f, -6.56f)
                reflectiveCurveToRelative(6.17f, 3.16f, 6.36f, 6.58f)
                curveToRelative(0f, 0f, 0.04f, 0.5f, 0.08f, 1.38f)
                curveToRelative(0.02f, 0.55f, -0.4f, 1.02f, -0.96f, 1.04f)
                curveToRelative(-0.54f, 0.02f, -1.02f, -0.4f, -1.04f, -0.96f)
                curveToRelative(-0.04f, -0.83f, -0.07f, -1.31f, -0.08f, -1.32f)
                curveToRelative(-0.21f, -3.67f, -1.18f, -4.72f, -4.36f, -4.72f)
                reflectiveCurveToRelative(-4.16f, 1.05f, -4.36f, 4.69f)
                close()
                moveTo(23f, 17f)
                curveToRelative(0f, 4.15f, -1.85f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.85f, -6f, -6f)
                reflectiveCurveToRelative(1.85f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.85f, 6f, 6f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.95f, 0.11f, 1.67f, 0.33f, 2.25f)
                lineToRelative(5.92f, -5.92f)
                curveToRelative(-0.58f, -0.22f, -1.3f, -0.33f, -2.25f, -0.33f)
                curveToRelative(-3.03f, 0f, -4f, 0.97f, -4f, 4f)
                close()
                moveTo(21f, 17f)
                curveToRelative(0f, -0.95f, -0.11f, -1.67f, -0.33f, -2.25f)
                lineToRelative(-5.92f, 5.92f)
                curveToRelative(0.58f, 0.22f, 1.3f, 0.33f, 2.25f, 0.33f)
                curveToRelative(3.03f, 0f, 4f, -0.97f, 4f, -4f)
                close()
            }
        }.also { _Pills = it}
