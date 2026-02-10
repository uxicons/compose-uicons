package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookWorld: ImageVector? = null

val Icons.Bs.BookWorld: ImageVector
    get() = _BookWorld ?: UXIcon(name = "BookWorld") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(-0.05f, 11f)
                lineToRelative(0.07f, 1.57f)
                curveToRelative(0.3f, 6.41f, 5.56f, 11.43f, 11.97f, 11.43f)
                reflectiveCurveToRelative(11.67f, -5.02f, 11.97f, -11.43f)
                lineToRelative(0.07f, -1.57f)
                lineTo(-0.05f, 11f)
                close()
                moveTo(14.36f, 14f)
                curveToRelative(-0.38f, 2.46f, -1.49f, 4.6f, -2.36f, 5.96f)
                curveToRelative(-0.87f, -1.35f, -1.98f, -3.49f, -2.36f, -5.96f)
                horizontalLineToRelative(4.72f)
                close()
                moveTo(3.24f, 14f)
                horizontalLineToRelative(3.38f)
                curveToRelative(0.31f, 2.52f, 1.24f, 4.74f, 2.16f, 6.4f)
                curveToRelative(-2.76f, -1.06f, -4.87f, -3.44f, -5.54f, -6.4f)
                close()
                moveTo(15.23f, 20.4f)
                curveToRelative(0.92f, -1.66f, 1.85f, -3.88f, 2.16f, -6.4f)
                horizontalLineToRelative(3.38f)
                curveToRelative(-0.67f, 2.96f, -2.78f, 5.34f, -5.54f, 6.4f)
                close()
                moveTo(4f, 9f)
                lineTo(1f, 9f)
                lineTo(1f, 3.36f)
                curveTo(0.95f, 1.32f, 3.0f, -0.36f, 4.99f, 0.09f)
                lineToRelative(5.7f, 1.15f)
                curveToRelative(0.49f, 0.1f, 0.92f, 0.3f, 1.31f, 0.58f)
                curveToRelative(0.39f, -0.27f, 0.82f, -0.48f, 1.31f, -0.58f)
                lineTo(19.01f, 0.09f)
                curveToRelative(1.99f, -0.45f, 4.04f, 1.22f, 3.99f, 3.27f)
                verticalLineToRelative(5.64f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 3.36f)
                curveToRelative(-0.03f, -0.24f, -0.15f, -0.35f, -0.4f, -0.33f)
                lineToRelative(-5.7f, 1.15f)
                curveToRelative(-0.23f, 0.05f, -0.4f, 0.25f, -0.4f, 0.49f)
                verticalLineToRelative(4.33f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 4.67f)
                curveToRelative(0f, -0.24f, -0.17f, -0.44f, -0.4f, -0.49f)
                lineToRelative(-5.7f, -1.15f)
                curveToRelative(-0.24f, -0.02f, -0.37f, 0.08f, -0.4f, 0.33f)
                verticalLineToRelative(5.64f)
                close()
            }
        }.also { _BookWorld = it}
