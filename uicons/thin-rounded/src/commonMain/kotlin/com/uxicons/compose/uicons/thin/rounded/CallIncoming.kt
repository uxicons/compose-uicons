package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallIncoming: ImageVector? = null

val Icons.Tr.CallIncoming: ImageVector
    get() = _CallIncoming ?: UXIcon(name = "CallIncoming") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                lineTo(15f, 2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.1f, 0.01f, 0.19f, 0.04f, 0.28f)
                lineTo(23.15f, 0.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(-7.09f, 7.12f)
                curveToRelative(0.08f, 0.02f, 0.15f, 0.03f, 0.24f, 0.03f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(23.16f, 17.3f)
                curveToRelative(0.56f, 0.55f, 0.84f, 1.23f, 0.84f, 1.95f)
                reflectiveCurveToRelative(-0.28f, 1.4f, -0.79f, 1.9f)
                lineToRelative(-0.98f, 1.12f)
                curveToRelative(-1.12f, 1.12f, -2.61f, 1.73f, -4.21f, 1.73f)
                curveTo(10.28f, 24f, 0f, 13.72f, 0f, 5.98f)
                curveToRelative(0f, -1.6f, 0.6f, -3.09f, 1.71f, -4.19f)
                lineToRelative(1.17f, -1.02f)
                curveToRelative(0.97f, -0.97f, 2.76f, -0.99f, 3.78f, 0.02f)
                lineToRelative(1.96f, 2.54f)
                curveToRelative(1.01f, 1f, 1.01f, 2.71f, -0.04f, 3.76f)
                lineToRelative(-1.49f, 1.52f)
                curveToRelative(1.62f, 3.8f, 4.61f, 6.8f, 8.29f, 8.3f)
                lineToRelative(1.53f, -1.49f)
                curveToRelative(1.05f, -1.05f, 2.75f, -1.05f, 3.8f, 0.0f)
                lineToRelative(2.45f, 1.87f)
                close()
                moveTo(22.5f, 18.05f)
                lineToRelative(-2.45f, -1.87f)
                curveToRelative(-0.74f, -0.72f, -1.8f, -0.68f, -2.44f, -0.04f)
                curveToRelative(0f, 0.0f, -1.77f, 1.73f, -1.77f, 1.73f)
                curveToRelative(-0.14f, 0.14f, -0.34f, 0.18f, -0.53f, 0.11f)
                curveToRelative(-4.17f, -1.59f, -7.56f, -4.97f, -9.29f, -9.28f)
                curveToRelative(-0.07f, -0.18f, -0.03f, -0.39f, 0.11f, -0.54f)
                lineToRelative(1.72f, -1.77f)
                curveToRelative(0.66f, -0.66f, 0.66f, -1.74f, 0.0f, -2.4f)
                lineToRelative(-1.96f, -2.54f)
                curveToRelative(-0.3f, -0.3f, -0.71f, -0.45f, -1.13f, -0.45f)
                curveToRelative(-0.44f, 0f, -0.88f, 0.17f, -1.22f, 0.5f)
                lineToRelative(-1.18f, 1.02f)
                curveToRelative(-0.89f, 0.89f, -1.39f, 2.12f, -1.39f, 3.46f)
                curveToRelative(0f, 7.16f, 9.86f, 17.02f, 17.02f, 17.02f)
                curveToRelative(1.33f, 0f, 2.57f, -0.5f, 3.48f, -1.41f)
                lineToRelative(0.98f, -1.12f)
                curveToRelative(0.68f, -0.69f, 0.68f, -1.76f, 0.02f, -2.42f)
                close()
            }
        }.also { _CallIncoming = it}
