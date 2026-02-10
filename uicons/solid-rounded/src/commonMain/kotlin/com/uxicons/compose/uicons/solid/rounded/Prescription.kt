package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Prescription: ImageVector? = null

val Icons.Sr.Prescription: ImageVector
    get() = _Prescription ?: UXIcon(name = "Prescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.87f, 18f)
                lineToRelative(2.96f, -4.45f)
                curveToRelative(0.31f, -0.46f, 0.18f, -1.08f, -0.28f, -1.39f)
                curveToRelative(-0.46f, -0.31f, -1.08f, -0.18f, -1.39f, 0.28f)
                lineToRelative(-2.5f, 3.75f)
                lineToRelative(-2.96f, -4.45f)
                curveToRelative(2.48f, -0.74f, 4.3f, -3.03f, 4.3f, -5.75f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-4.0f)
                curveTo(5.24f, 0f, 3.0f, 2.24f, 3.0f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6.47f)
                lineToRelative(4f, 6f)
                lineToRelative(-2.96f, 4.45f)
                curveToRelative(-0.31f, 0.46f, -0.18f, 1.08f, 0.28f, 1.39f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.17f, 0.55f, 0.17f)
                curveToRelative(0.32f, 0f, 0.64f, -0.16f, 0.83f, -0.45f)
                lineToRelative(2.5f, -3.75f)
                lineToRelative(2.5f, 3.75f)
                curveToRelative(0.19f, 0.29f, 0.51f, 0.45f, 0.83f, 0.45f)
                curveToRelative(0.19f, 0f, 0.38f, -0.06f, 0.55f, -0.17f)
                curveToRelative(0.46f, -0.31f, 0.58f, -0.93f, 0.28f, -1.39f)
                lineToRelative(-2.96f, -4.45f)
                close()
                moveTo(5.0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _Prescription = it}
