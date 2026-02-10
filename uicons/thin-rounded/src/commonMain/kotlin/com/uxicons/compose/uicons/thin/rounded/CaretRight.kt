package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretRight: ImageVector? = null

val Icons.Tr.CaretRight: ImageVector
    get() = _CaretRight ?: UXIcon(name = "CaretRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.25f, 19.0f)
                curveToRelative(-0.16f, 0f, -0.33f, -0.03f, -0.49f, -0.1f)
                curveToRelative(-0.47f, -0.2f, -0.76f, -0.64f, -0.76f, -1.15f)
                lineTo(9f, 6.24f)
                curveToRelative(0f, -0.51f, 0.29f, -0.95f, 0.76f, -1.15f)
                curveToRelative(0.47f, -0.2f, 0.98f, -0.1f, 1.35f, 0.26f)
                lineToRelative(5.19f, 5.05f)
                curveToRelative(0.44f, 0.4f, 0.7f, 0.98f, 0.7f, 1.6f)
                reflectiveCurveToRelative(-0.26f, 1.2f, -0.72f, 1.61f)
                lineToRelative(-5.17f, 5.03f)
                curveToRelative(-0.24f, 0.23f, -0.55f, 0.35f, -0.86f, 0.35f)
                close()
                moveTo(10.25f, 6f)
                curveToRelative(-0.04f, 0f, -0.08f, 0.01f, -0.1f, 0.02f)
                curveToRelative(-0.04f, 0.02f, -0.15f, 0.08f, -0.15f, 0.22f)
                verticalLineToRelative(11.51f)
                curveToRelative(0f, 0.14f, 0.1f, 0.2f, 0.15f, 0.22f)
                curveToRelative(0.04f, 0.02f, 0.16f, 0.05f, 0.26f, -0.05f)
                lineToRelative(5.19f, -5.05f)
                curveToRelative(0.27f, -0.24f, 0.4f, -0.55f, 0.4f, -0.88f)
                reflectiveCurveToRelative(-0.14f, -0.65f, -0.39f, -0.87f)
                lineToRelative(-5.2f, -5.06f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.07f, -0.16f, -0.07f)
                close()
            }
        }.also { _CaretRight = it}
