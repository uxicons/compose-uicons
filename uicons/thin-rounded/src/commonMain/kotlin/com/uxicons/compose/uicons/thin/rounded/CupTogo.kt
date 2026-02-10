package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Tr.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 5f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(-0.47f, -2.22f)
                curveToRelative(-0.34f, -1.61f, -1.78f, -2.78f, -3.43f, -2.78f)
                lineTo(6.58f, 0f)
                curveToRelative(-1.65f, 0f, -3.09f, 1.17f, -3.43f, 2.78f)
                lineToRelative(-0.47f, 2.22f)
                horizontalLineToRelative(-1.19f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.15f)
                lineToRelative(1.54f, 13.99f)
                curveToRelative(0.25f, 2.29f, 2.17f, 4.01f, 4.47f, 4.01f)
                horizontalLineToRelative(6.68f)
                curveToRelative(2.3f, 0f, 4.22f, -1.72f, 4.47f, -4.01f)
                lineToRelative(1.54f, -13.99f)
                horizontalLineToRelative(1.15f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(4.13f, 2.99f)
                curveToRelative(0.24f, -1.15f, 1.27f, -1.99f, 2.45f, -1.99f)
                horizontalLineToRelative(10.84f)
                curveToRelative(1.18f, 0f, 2.21f, 0.84f, 2.45f, 1.99f)
                lineToRelative(0.42f, 2.01f)
                lineTo(3.71f, 5f)
                lineToRelative(0.42f, -2.01f)
                close()
                moveTo(18.82f, 19.88f)
                curveToRelative(-0.2f, 1.78f, -1.69f, 3.12f, -3.48f, 3.12f)
                horizontalLineToRelative(-6.68f)
                curveToRelative(-1.79f, 0f, -3.28f, -1.34f, -3.48f, -3.12f)
                lineToRelative(-0.1f, -0.88f)
                horizontalLineToRelative(13.84f)
                lineToRelative(-0.1f, 0.88f)
                close()
                moveTo(19.03f, 18.0f)
                curveToRelative(-0.01f, 0f, -0.02f, -0.01f, -0.03f, -0.01f)
                lineTo(5f, 18f)
                curveToRelative(-0.01f, 0f, -0.02f, 0.01f, -0.03f, 0.01f)
                lineToRelative(-0.77f, -7.01f)
                horizontalLineToRelative(15.59f)
                lineToRelative(-0.77f, 7.0f)
                close()
                moveTo(19.91f, 10f)
                lineTo(4.09f, 10f)
                lineToRelative(-0.44f, -4f)
                horizontalLineToRelative(16.69f)
                lineToRelative(-0.44f, 4f)
                close()
            }
        }.also { _CupTogo = it}
