package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretLeft: ImageVector? = null

val Icons.Tr.CaretLeft: ImageVector
    get() = _CaretLeft ?: UXIcon(name = "CaretLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.75f, 19.0f)
                curveToRelative(-0.31f, 0f, -0.62f, -0.12f, -0.86f, -0.35f)
                lineToRelative(-5.19f, -5.05f)
                curveToRelative(-0.44f, -0.4f, -0.7f, -0.98f, -0.7f, -1.6f)
                reflectiveCurveToRelative(0.26f, -1.2f, 0.72f, -1.61f)
                lineToRelative(5.17f, -5.03f)
                curveToRelative(0.36f, -0.35f, 0.88f, -0.45f, 1.35f, -0.26f)
                reflectiveCurveToRelative(0.76f, 0.64f, 0.76f, 1.15f)
                verticalLineToRelative(11.51f)
                curveToRelative(0f, 0.51f, -0.29f, 0.95f, -0.76f, 1.15f)
                curveToRelative(-0.16f, 0.07f, -0.33f, 0.1f, -0.49f, 0.1f)
                close()
                moveTo(14.75f, 6f)
                curveToRelative(-0.05f, 0f, -0.11f, 0.02f, -0.16f, 0.07f)
                lineToRelative(-5.19f, 5.05f)
                curveToRelative(-0.27f, 0.24f, -0.4f, 0.55f, -0.4f, 0.88f)
                reflectiveCurveToRelative(0.14f, 0.65f, 0.39f, 0.87f)
                lineToRelative(5.2f, 5.06f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.07f, 0.26f, 0.05f)
                curveToRelative(0.04f, -0.02f, 0.15f, -0.08f, 0.15f, -0.22f)
                lineTo(15f, 6.24f)
                curveToRelative(0f, -0.14f, -0.1f, -0.2f, -0.15f, -0.22f)
                curveToRelative(-0.02f, -0.01f, -0.06f, -0.02f, -0.1f, -0.02f)
                close()
            }
        }.also { _CaretLeft = it}
