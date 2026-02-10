package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashRestore: ImageVector? = null

val Icons.Tr.TrashRestore: ImageVector
    get() = _TrashRestore ?: UXIcon(name = "TrashRestore") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 4f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-0.25f, -2.25f, -2.16f, -4f, -4.47f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.31f, 0f, -4.22f, 1.75f, -4.47f, 4f)
                lineTo(1.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, 0.01f, 0f, 0.03f, 0.0f, 0.05f)
                lineToRelative(1.39f, 14.87f)
                curveToRelative(0.22f, 2.33f, 2.14f, 4.08f, 4.48f, 4.08f)
                horizontalLineToRelative(6.27f)
                curveToRelative(2.34f, 0f, 4.27f, -1.76f, 4.48f, -4.09f)
                lineToRelative(1.37f, -14.87f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.03f, 0.0f, -0.05f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(11f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(7.54f, 4f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
                moveTo(18.63f, 19.82f)
                curveToRelative(-0.17f, 1.81f, -1.67f, 3.18f, -3.48f, 3.18f)
                horizontalLineToRelative(-6.27f)
                curveToRelative(-1.82f, 0f, -3.31f, -1.36f, -3.48f, -3.17f)
                lineToRelative(-1.39f, -14.83f)
                horizontalLineToRelative(15.99f)
                lineToRelative(-1.37f, 14.82f)
                close()
                moveTo(15.91f, 13.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.01f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.22f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.36f, -0.15f)
                lineToRelative(-2.52f, -2.57f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.1f, -0.18f, -0.14f)
                verticalLineToRelative(7.36f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.36f)
                curveToRelative(-0.07f, 0.04f, -0.13f, 0.09f, -0.19f, 0.15f)
                lineToRelative(-2.51f, 2.57f)
                curveToRelative(-0.19f, 0.2f, -0.51f, 0.2f, -0.71f, 0.01f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                lineToRelative(2.52f, -2.57f)
                curveToRelative(0.38f, -0.38f, 0.89f, -0.58f, 1.39f, -0.58f)
                curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
                curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
                curveToRelative(0.5f, 0.0f, 1.0f, 0.19f, 1.39f, 0.58f)
                lineToRelative(2.52f, 2.57f)
                close()
            }
        }.also { _TrashRestore = it}
