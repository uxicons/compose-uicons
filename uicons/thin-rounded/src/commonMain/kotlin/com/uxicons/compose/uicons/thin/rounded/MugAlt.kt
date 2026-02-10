package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Tr.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 2.49f, -2.01f, 5.5f, -4.5f, 5.5f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-0.55f, 3.25f)
                curveToRelative(-0.36f, 2.17f, -2.23f, 3.75f, -4.44f, 3.75f)
                horizontalLineToRelative(-6.23f)
                curveToRelative(-2.21f, 0f, -4.07f, -1.58f, -4.44f, -3.75f)
                lineTo(0.06f, 3.02f)
                curveToRelative(-0.16f, -0.72f, 0.02f, -1.49f, 0.5f, -2.08f)
                curveToRelative(0.48f, -0.59f, 1.19f, -0.94f, 1.95f, -0.94f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.76f, 0f, 1.48f, 0.34f, 1.95f, 0.94f)
                curveToRelative(0.48f, 0.59f, 0.66f, 1.36f, 0.49f, 2.11f)
                lineToRelative(-0.33f, 1.96f)
                curveToRelative(2.79f, 0.03f, 4.39f, 1.3f, 4.39f, 3.5f)
                close()
                moveTo(16.57f, 17.08f)
                lineToRelative(1.94f, -11.52f)
                curveToRelative(-0.0f, -0.02f, -0.0f, -0.04f, -0.0f, -0.06f)
                curveToRelative(0f, -0.08f, 0.02f, -0.15f, 0.05f, -0.22f)
                lineToRelative(0.41f, -2.43f)
                curveToRelative(0.1f, -0.47f, -0.0f, -0.93f, -0.29f, -1.29f)
                reflectiveCurveToRelative(-0.71f, -0.56f, -1.17f, -0.56f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.46f, 0f, -0.88f, 0.2f, -1.17f, 0.56f)
                curveToRelative(-0.29f, 0.35f, -0.39f, 0.82f, -0.29f, 1.26f)
                lineToRelative(2.4f, 14.26f)
                curveToRelative(0.28f, 1.69f, 1.74f, 2.92f, 3.45f, 2.92f)
                horizontalLineToRelative(6.23f)
                curveToRelative(1.72f, 0f, 3.17f, -1.23f, 3.45f, -2.92f)
                close()
                moveTo(23f, 8.5f)
                curveToRelative(0f, -1.66f, -1.18f, -2.5f, -3.5f, -2.5f)
                horizontalLineToRelative(-0.06f)
                lineToRelative(-1.18f, 7f)
                horizontalLineToRelative(1.23f)
                curveToRelative(1.85f, 0f, 3.5f, -2.52f, 3.5f, -4.5f)
                close()
            }
        }.also { _MugAlt = it}
