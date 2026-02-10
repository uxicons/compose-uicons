package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonToDoor: ImageVector? = null

val Icons.Sr.PersonToDoor: ImageVector
    get() = _PersonToDoor ?: UXIcon(name = "PersonToDoor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 4f)
                lineTo(24f, 20f)
                curveToRelative(0f, 2.34f, -2.01f, 4.21f, -4.4f, 3.98f)
                curveToRelative(-2.08f, -0.2f, -3.6f, -2.07f, -3.6f, -4.16f)
                verticalLineToRelative(-4.82f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.51f)
                curveToRelative(-0.88f, 0f, -1.69f, -0.46f, -2.14f, -1.21f)
                lineToRelative(-1.05f, -1.75f)
                lineToRelative(-2.27f, 5.53f)
                lineToRelative(1.8f, 1.14f)
                curveToRelative(0.72f, 0.46f, 1.16f, 1.25f, 1.16f, 2.11f)
                verticalLineToRelative(4.17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.17f)
                curveToRelative(0f, -0.17f, -0.09f, -0.33f, -0.23f, -0.42f)
                lineToRelative(-3.88f, -2.46f)
                curveToRelative(-1.23f, -0.78f, -1.72f, -2.33f, -1.17f, -3.67f)
                lineToRelative(1.75f, -4.27f)
                lineTo(3.93f, 8.0f)
                curveToRelative(-0.19f, 0f, -0.36f, 0.11f, -0.45f, 0.28f)
                lineToRelative(-1.58f, 3.17f)
                curveToRelative(-0.25f, 0.49f, -0.85f, 0.69f, -1.34f, 0.45f)
                curveToRelative(-0.49f, -0.25f, -0.69f, -0.85f, -0.45f, -1.34f)
                lineToRelative(1.58f, -3.17f)
                curveToRelative(0.42f, -0.85f, 1.29f, -1.38f, 2.24f, -1.38f)
                horizontalLineToRelative(5.01f)
                curveToRelative(1.4f, 0f, 2.7f, 0.73f, 3.43f, 1.94f)
                lineToRelative(1.7f, 2.82f)
                curveToRelative(0.09f, 0.15f, 0.25f, 0.24f, 0.43f, 0.24f)
                horizontalLineToRelative(1.51f)
                lineTo(16.0f, 4.18f)
                curveToRelative(0f, -2.09f, 1.52f, -3.96f, 3.6f, -4.16f)
                curveToRelative(2.38f, -0.23f, 4.4f, 1.64f, 4.4f, 3.98f)
                close()
                moveTo(4.87f, 17.08f)
                curveToRelative(-0.51f, -0.2f, -1.09f, 0.04f, -1.3f, 0.54f)
                curveToRelative(0f, 0.0f, -0.17f, 0.37f, -0.42f, 0.37f)
                lineTo(1f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(3.15f, 20f)
                curveToRelative(1.3f, 0f, 2.04f, -1.03f, 2.28f, -1.64f)
                curveToRelative(0.2f, -0.51f, -0.06f, -1.07f, -0.56f, -1.28f)
                close()
            }
        }.also { _PersonToDoor = it}
