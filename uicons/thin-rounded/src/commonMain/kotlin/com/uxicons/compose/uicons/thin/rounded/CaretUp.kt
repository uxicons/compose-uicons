package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretUp: ImageVector? = null

val Icons.Tr.CaretUp: ImageVector
    get() = _CaretUp ?: UXIcon(name = "CaretUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.76f, 16f)
                lineTo(6.24f, 16f)
                curveToRelative(-0.51f, 0f, -0.95f, -0.29f, -1.14f, -0.76f)
                curveToRelative(-0.2f, -0.47f, -0.1f, -0.98f, 0.25f, -1.35f)
                lineToRelative(5.05f, -5.19f)
                curveToRelative(0.79f, -0.89f, 2.39f, -0.9f, 3.21f, 0.01f)
                lineToRelative(5.03f, 5.17f)
                curveToRelative(0.35f, 0.36f, 0.45f, 0.88f, 0.25f, 1.35f)
                curveToRelative(-0.2f, 0.47f, -0.64f, 0.76f, -1.14f, 0.76f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-0.34f, 0f, -0.65f, 0.14f, -0.87f, 0.39f)
                lineToRelative(-5.06f, 5.2f)
                curveToRelative(-0.1f, 0.1f, -0.07f, 0.22f, -0.05f, 0.26f)
                curveToRelative(0.02f, 0.04f, 0.08f, 0.15f, 0.22f, 0.15f)
                horizontalLineToRelative(11.51f)
                curveToRelative(0.14f, 0f, 0.2f, -0.1f, 0.22f, -0.15f)
                curveToRelative(0.02f, -0.04f, 0.05f, -0.16f, -0.05f, -0.26f)
                lineToRelative(-5.05f, -5.19f)
                curveToRelative(-0.24f, -0.27f, -0.55f, -0.4f, -0.88f, -0.4f)
                close()
            }
        }.also { _CaretUp = it}
