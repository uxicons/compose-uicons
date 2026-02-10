package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Tr.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-4.14f, -4.14f)
                lineToRelative(1.29f, -13.96f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.03f, 0.0f, -0.05f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-0.25f, -2.25f, -2.16f, -4f, -4.47f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.31f, 0f, -4.22f, 1.75f, -4.47f, 4f)
                horizontalLineToRelative(-1.82f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(11f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(7.54f, 4f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
                moveTo(20.0f, 5f)
                lineToRelative(-1.21f, 13.09f)
                lineTo(5.71f, 5f)
                horizontalLineToRelative(14.29f)
                close()
                moveTo(18.17f, 22.17f)
                curveToRelative(0.18f, 0.21f, 0.16f, 0.52f, -0.04f, 0.71f)
                curveToRelative(-0.82f, 0.73f, -1.88f, 1.12f, -2.98f, 1.12f)
                horizontalLineToRelative(-6.27f)
                curveToRelative(-2.34f, 0f, -4.26f, -1.75f, -4.48f, -4.08f)
                lineToRelative(-1.16f, -12.37f)
                curveToRelative(-0.03f, -0.28f, 0.18f, -0.52f, 0.45f, -0.55f)
                curveToRelative(0.27f, -0.01f, 0.52f, 0.18f, 0.54f, 0.45f)
                lineToRelative(1.16f, 12.37f)
                curveToRelative(0.17f, 1.81f, 1.67f, 3.17f, 3.48f, 3.17f)
                horizontalLineToRelative(6.27f)
                curveToRelative(0.85f, 0f, 1.68f, -0.31f, 2.31f, -0.88f)
                curveToRelative(0.21f, -0.18f, 0.52f, -0.16f, 0.71f, 0.04f)
                close()
            }
        }.also { _TrashSlash = it}
